package com.example.tryfx;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.geometry.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
////Adam Nassan 1202076 Lab Section: 5
        public class HelloApplication extends Application {
            public void start(Stage primaryStage) throws FileNotFoundException {

                ArrayList<PizzaOrder> orders = new ArrayList<>();//Created arraylist of pizzaorder
                String pizza_size[] = { "Small", "Medium", "Large"};
                VBox p = new VBox(30);
                //p.setLayoutX(300);
                Image image = new Image("C:\\Users\\asus\\IdeaProjects\\tryfx\\src\\main\\java\\com\\example\\tryfx\\0a300da67594ab3dc65e724ac8021330 (2).jpg");
                //Setting the image view
                ImageView imageView = new ImageView(image);
                imageView.setFitWidth(1600);
                imageView.setFitHeight(780);

                //Divided the design into HBoxes each has its label and text field or button as demanded
                HBox h = new HBox(5);
                Label l1 = new Label("Customer Name");
                l1.setFont(new Font("Arial",30));
                l1.setTextFill(Color.BLACK);
                l1.setPrefSize(250,110);
                TextField t1 = new TextField();
                t1.setPrefSize(500,50);
                t1.setFont(new Font("Arial",30));
                h.setLayoutX(100);
                h.setLayoutY(50);
                h.setPrefSize(20,30);
                h.getChildren().addAll(l1, t1);


                HBox h2 = new HBox(20);
                h2.setLayoutY(50);
                Label l2 = new Label("Order Type");
                l2.setFont(new Font("Arial",30));
                l2.setTextFill(Color.BLACK);
                l2.setPrefSize(235,25);
                RadioButton b1 = new RadioButton("ToGo");
                RadioButton b2 = new RadioButton("Delivery");
                RadioButton b3 = new RadioButton("Seated");
                b1.setFont(new Font("Time New Roman",15));
                b2.setFont(new Font("Time New Roman",15));
                b3.setFont(new Font("Time New Roman",15));
                b1.setPrefSize(100,45);
                b2.setPrefSize(100,45);
                b3.setPrefSize(100,45);
                ToggleGroup to = new ToggleGroup();
                to.getToggles().addAll(b1, b2, b3);
                to.selectToggle(b1);
                h2.getChildren().addAll(l2,b1,b2,b3);

                HBox h3 = new HBox(5);
                h3.setLayoutY(50);
                Label l3 = new Label("Pizza Size");
                l3.setFont(new Font("Arial",30));
                l3.setTextFill(Color.BLACK);
                l3.setPrefSize(247,50);
                ComboBox c = new ComboBox<>(FXCollections.observableArrayList(pizza_size));
                c.setValue("Small");
                c.setPrefSize(400,50);
                h3.getChildren().addAll(l3,c);

                HBox h4 = new HBox(5);
                Label l4 = new Label("List Of Toppings");
                l4.setFont(new Font("Arial",30));
                l4.setPrefSize(247,10);
                l4.setTextFill(Color.BLACK);
                CheckBox cb1 =new CheckBox("Onions");
                CheckBox cb2 =new CheckBox("Olives");
                CheckBox cb3 =new CheckBox("Green Peppers");
                cb1.setTextFill(Color.BLACK);
                cb2.setTextFill(Color.BLACK);
                cb3.setTextFill(Color.BLACK);
                cb1.setFont(new Font("Time New Roman",15));
                cb2.setFont(new Font("Time New Roman",15));
                cb3.setFont(new Font("Time New Roman",15));
                cb1.setPrefSize(100,45);
                cb2.setPrefSize(100,45);
                cb3.setPrefSize(200,45);
                h4.setLayoutY(50);
                h4.getChildren().addAll(l4,cb1,cb2,cb3);

                HBox h5 = new HBox(5);
                Label l5 = new Label("Topping Price");
                l5.setTextFill(Color.BLACK);
                l5.setFont(new Font("Arial",30));
                l5.setPrefSize(245,55);
                TextField t2 = new TextField();
                t2.setPrefSize(500,50);
                t2.setFont(new Font("Arial",30));
                t2.setText("10");
                h5.setLayoutX(50);
                h5.getChildren().addAll(l5, t2);

                HBox h6 = new HBox(5);
                Label l6 = new Label("Order Price");
                l6.setTextFill(Color.BLACK);
                l6.setFont(new Font("Arial",30));
                l6.setPrefSize(245,55);
                TextField t3 = new TextField();
                t3.setPrefSize(500,50);
                t3.setFont(new Font("Arial",30));
                t3.setText("0.0");
                h6.setLayoutX(50);
                h6.getChildren().addAll(l6, t3);


                HBox h7 = new HBox(5);
                Button button1 = new Button("Process Order ");
                button1.setAlignment(Pos.CENTER);
                button1.setPrefSize(245,55);
                button1.setFont(new Font("Time New Roman",17));
                h7.getChildren().add(button1);
                Button button2 = new Button("Print Orders ");
                button2.setFont(new Font("Time New Roman",17));
                button2.setPrefSize(245,55);
                button2.setAlignment(Pos.CENTER);
                h7.getChildren().add(button2);
                Button button3 = new Button("Reset ");
                button3.setFont(new Font("Time New Roman",17));
                button3.setPrefSize(245,55);
                button3.setAlignment(Pos.CENTER);
                h7.getChildren().add(button3);

                HBox h8 = new HBox(5);
                Label l7 = new Label("Trip Rate");
                l7.setFont(new Font("Arial",30));
                l7.setTextFill(Color.BLACK);
                l7.setPrefSize(240,60);
                TextField t4 = new TextField();
                t4.setPrefSize(500,50);
                t4.setFont(new Font("Arial",30));
                t4.setText("0");
                h8.setLayoutX(50);
                h8.getChildren().addAll(l7, t4);

                HBox h9 = new HBox(5);
                Label l8 = new Label("Zone");
                l8.setFont(new Font("Arial",30));
                l8.setTextFill(Color.BLACK);
                l8.setPrefSize(240,60);
                TextField t5 = new TextField();
                t5.setPrefSize(500,50);
                t5.setFont(new Font("Arial",30));
                t5.setText("0");
                h9.setLayoutX(50);
                h9.getChildren().addAll(l8, t5);

                HBox h10 = new HBox(5);
                Label l9 = new Label("Service Change");
                l9.setFont(new Font("Arial",30));
                l9.setTextFill(Color.BLACK);
                l9.setPrefSize(240,60);
                TextField t6 = new TextField();
                t6.setPrefSize(500,50);
                t6.setFont(new Font("Arial",30));
                t6.setText("0");
                h10.setLayoutX(50);
                h10.getChildren().addAll(l9, t6);

                HBox h11 = new HBox(5);
                Label l10 = new Label("Num Of People");
                l10.setTextFill(Color.BLACK);
                l10.setFont(new Font("Arial",30));
                l10.setPrefSize(240,60);
                TextField t7 = new TextField();
                t7.setPrefSize(500,50);
                t7.setFont(new Font("Arial",30));
                t7.setText("0");
                h11.setLayoutX(50);
                h11.getChildren().addAll(l10, t7);
                //Add all design HBoxes into VBox
                p.getChildren().addAll(h,h2,h3,h4,h5,h6,h7);

                //If toGo selected remove all additional HBoxes
                b1.setOnAction(e->{
                    if(b1.isSelected()){
                    p.getChildren().removeAll(h8,h9,h10,h11);
                    }
                });
                //If Delivery selected add Delivery additional HBoxes
                b2.setOnAction(e->{
                    if(b2.isSelected()){
                        p.getChildren().remove(h7);
                        p.getChildren().addAll(h8,h9,h7);
                        p.getChildren().removeAll(h10,h11);
                    }
                });
                //If Seated selected add Seated additional HBoxes
                b3.setOnAction(e->{
                    if(b3.isSelected()){
                        p.getChildren().remove(h7);
                        p.getChildren().addAll(h10,h11,h7);
                        p.getChildren().removeAll(h8,h9);
                    }
                });
                //if process order button selected
                button1.setOnAction(e->{
                    String CustomerName = t1.getText();
                    int PizzaSize=1;
                    //pizza size election
                    if(c.getValue().equals("Small"))
                        PizzaSize=PizzaOrder.SMALL;
                    else if (c.getValue().equals("Medium")) {
                        PizzaSize=PizzaOrder.MEDIUM;
                    } else if (c.getValue().equals("Large")) {
                        PizzaSize=PizzaOrder.LARGE;
                    }
                    //decide number of toppings depending on selected toppings
                    int numOfToppings=1;
                    if(cb1.isSelected()&&cb2.isSelected()&&cb3.isSelected())
                        numOfToppings=4;
                    else if (cb1.isSelected()&&cb2.isSelected() || cb1.isSelected()&&cb3.isSelected()||cb2.isSelected()&&cb3.isSelected())
                        numOfToppings=3;
                    else if(cb1.isSelected()||cb2.isSelected()||cb3.isSelected())
                        numOfToppings=2;

                    int ToppingPrice =  Integer.parseInt(t2.getText());
                    int tripRate =  Integer.parseInt(t4.getText());
                    int zone =  Integer.parseInt(t5.getText());
                    int serviceChange =Integer.parseInt(t6.getText());
                    int numOfPeople = Integer.parseInt(t7.getText());

                   //Decide order type to calculate the price
                    if(b1.isSelected()){
                      orders.add(new ToGo(CustomerName,PizzaSize,numOfToppings,ToppingPrice));
                      t3.setText(numOfToppings*ToppingPrice*PizzaSize+"");
                    }
                   else if(b2.isSelected()) {
                        orders.add(new Delivery(CustomerName, PizzaSize, numOfToppings, ToppingPrice, tripRate, zone));
                        t3.setText(Double.valueOf(numOfToppings*ToppingPrice*PizzaSize+ Double.valueOf(tripRate)/100.0 * (numOfToppings*ToppingPrice*PizzaSize)*zone)+"");
                    }
                    else if(b3.isSelected()) {
                        orders.add(new Seated(CustomerName, PizzaSize, numOfToppings, ToppingPrice, serviceChange, numOfPeople));
                        t3.setText( numOfToppings*ToppingPrice*PizzaSize + serviceChange * numOfPeople+"");
                    }
                    System.out.println("Total orders prices: "+calculateTotalOrdersPrice(orders));//print total price
                });
                //if print orders button selected
                button2.setOnAction(e->{
                    sortOrders(orders);//sort orders function
                // print in new stage
                    newStage(orders);
                });
                //if reset orders button selected
                button3.setOnAction(e->{
                    //reset all data to default and delete all orders
                    c.setValue("Small");
                    t1.setText("");
                    t2.setText("10");
                    t3.setText("0.0");
                    t4.setText("0");
                    t5.setText("0");
                    t6.setText("0");
                    t7.setText("0");
                    to.selectToggle(b1);
                    cb1.setSelected(false);
                    cb2.setSelected(false);
                    cb3.setSelected(false);
                    orders.clear();
                });
                p.setCenterShape(true);
                p.setAlignment(Pos.CENTER);
                //add image and vbox into stack pane
                StackPane panee = new StackPane(imageView,p);
                //add stack pane into scene
                Scene s = new Scene(panee, 1600, 900);
                primaryStage.setScene(s);
                primaryStage.setTitle("Adam Pizza");
                primaryStage.show();
                primaryStage.setMaximized(true);


            }

            public static void main(String[] args) {
                launch(args);
            }

          public static double calculateTotalOrdersPrice(ArrayList<PizzaOrder> orders){
                double Total=0;
                //loop to calculate the total price
                for(int i=0;i<orders.size();i++) {
                    Total += orders.get(i).calculateOrderPrice();
                }
                return Total;
            }
            public static void sortOrders(ArrayList<PizzaOrder> orders){
                //sort orders using collection sort
                java.util.Collections.sort(orders);
            }
            //Method to show new page to print orders on it
            public void newStage(ArrayList <PizzaOrder> orders) {
                VBox p2 = new VBox();

                Image image = new Image("C:\\Users\\asus\\IdeaProjects\\tryfx\\src\\main\\java\\com\\example\\tryfx\\Free-Pizza-A4-Flyer-Design-Template.jpg");
                //Setting the image view
                ImageView imageView = new ImageView(image);
                imageView.setFitWidth(1600);
                imageView.setFitHeight(780);
               //print all orders on new HBox
                for(int i=0;i<orders.size();i++) {
                    HBox h12 = new HBox(5);
                    Label label = new Label("Order number ("+(i + 1) + "):- " + orders.get(i).getCustomerName()+"   "+orders.get(i).calculateOrderPrice());
                    label.setTextFill(Color.GOLD);
                    label.setFont(new Font("Arial",30));
                    label.setPrefSize(1500,30);
                    h12.setLayoutX(50);
                    h12.getChildren().addAll(label);
                    p2.getChildren().add(h12);
                }
                //Stack pane to put Vbox and the  image on it
                StackPane panee = new StackPane(imageView,p2);
                Scene s2 = new Scene(panee);
                Stage stage = new Stage();
                stage.setScene(s2);
                stage.setTitle("Orders page");
                stage.setMaximized(true);
                stage.show();
            }
        }