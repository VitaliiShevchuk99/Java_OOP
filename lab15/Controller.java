import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {
    public ArrayList<Lab10> list = new ArrayList<>();

    @FXML
    private TextField time;

    @FXML
    private TextField number;

    @FXML
    private TextField day;

    @FXML
    private TextField seats;

    @FXML
    private TextField stat;

    @FXML
    private TextField arrtime;

    @FXML
    private TextField toDelete;

    @FXML
    private TextField toFind;

    public void add() {
        BusTime busTime = new BusTime(time.getText());
        BusNumber num = new BusNumber(Integer.parseInt(number.getText()));
        ArrayList<String> days = new ArrayList<>();
        days.add(day.getText());
        DayWeek dayWeek = new DayWeek(days);
        Seats seat = new Seats(Integer.parseInt(seats.getText()));
        ArrayList<Direction> directions = new ArrayList<>();
        directions.add(new Direction(stat.getText(), arrtime.getText()));
        Route route = new Route(directions);
        list.add(new Lab10(busTime, num, dayWeek, seat, route));
        time.clear();
        number.clear();
        day.clear();
        seats.clear();
        stat.clear();
        arrtime.clear();
    }

    public void delete() {
        int ind = Integer.parseInt(toDelete.getText());
        if(ind < list.size() - 1 && ind > 0) {
            list.remove(ind);
        }
    }

    public void find() {
        int find = Integer.parseInt(toFind.getText());
        int res = -1;
        for(int i = 0; i < list.size(); i++) {
            if(find == list.get(i).getBusNumber().getNumber()) {
                res = i;
            }
        }
        System.out.println((res == -1) ? ("Not found") : ("Found at " + res));
    }
}