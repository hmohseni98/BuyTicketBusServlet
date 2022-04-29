package servlet;

import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Trip;
import model.enumeration.City;
import repository.TicketRepository;
import service.lmpl.TripServiceImpl;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

@WebServlet(name = "searchPanel" , value = "/search-panel")
public class SearchPanel extends HttpServlet {
    private final TripServiceImpl tripService = new TripServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        City source = City.valueOf(req.getParameter("source"));
        City destination = City.valueOf(req.getParameter("destination"));
        Date date = Date.valueOf(req.getParameter("date"));
        List<Trip> trips = tripService.findAllBySrcToDstAndDate(source,destination,date);
        Trip t = new Trip();
        req.setAttribute("tripList",trips);
        req.getRequestDispatcher("dir/panel.jsp")
                .forward(req,resp);
    }
}
