package cinema.controller;


import cinema.models.Seat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("seats")
public class SeatsController {

    final int totalRows = 9;
    final int totalColumns = 9;
    private final Map<String, Object> seatsList = new HashMap<String, Object>();

    public SeatsController() {

        this.seatsList.put("total_rows", totalRows);
        this.seatsList.put("total_columns", totalColumns);

        List availableSeats = new ArrayList();

        for (int row = 1; row <= totalRows; row++) {
            for (int column = 1; column <= totalColumns; column++) {
                availableSeats.add(addSeat(row, column ));
            }

        }

        this.seatsList.put("available_seats", availableSeats);

    }

    @GetMapping
    @ResponseBody

    public Object list() {
        return seatsList;
    }

    private Seat addSeat(int row, int column) {

        Seat seat = new Seat(row, column);
        return seat;
    }
}




