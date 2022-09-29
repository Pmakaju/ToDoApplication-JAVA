package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import sample.datamodel.TodoItem;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    @FXML
    private List<TodoItem> todoItems;

    @FXML
    private ListView <TodoItem> todoListView;

    @FXML
    private TextArea itemDetailsTextArea;

    @FXML
    private Label deadlineOfItem;

    @FXML
    public void initialize(){

        TodoItem item1 = new TodoItem("Lab HW 1",
                "I will be working on crazy",
                LocalDate.of(2022, 9, 22));
        TodoItem item2 = new TodoItem("JAVA HW ",
                "I will be working on fun Java homework",
                LocalDate.of(2022, 9, 22));
        TodoItem item3 = new TodoItem("Study",
                "I will be studying for my JAVA exam 1",
                LocalDate.of(2022, 9, 22));
        TodoItem item4 = new TodoItem("Walk my dog",
                "I will take my sweet for a nice walk",
                LocalDate.of(2022, 9, 22));
        TodoItem item5 = new TodoItem("Sleep",
                "I will go to be bed for a goodnight sleep",
                LocalDate.of(2022, 9, 22));

//  Initialize array list
        todoItems = new ArrayList<TodoItem>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);

        todoListView.getItems().setAll(todoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

    }
    @FXML
    public void handleMouseClick(){
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();
//        System.out.println(item + " is selected");
        itemDetailsTextArea.setText(item.getDetails());
        deadlineOfItem.setText(item.getDeadline().toString());

//        StringBuilder sb = new StringBuilder(item.getDetails());
//        sb.append("\n\n\n\n");
//        sb.append("Due Date: ");
//        sb.append(item.getDeadline().toString());
//        itemDetailsTextArea.setText(sb.toString());
    }
}
