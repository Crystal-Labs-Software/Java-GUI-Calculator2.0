import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.TextField;

public class Calculator2_0 extends Application {  

	double number1, number2, result;
	int addc = 0, mulc = 0, divc = 0, subc = 0, powc = 0, sqrtc = 0;
	TextField text = new TextField();

	@Override
	public void start(Stage primaryStage) throws Exception {

		FlowPane pane = new FlowPane();

		pane.setPrefSize(340, 460);

		pane.setStyle("-fx-background-color: #a6a6a6; -fx-border-width: 5px; -fx-border-color: #4d4d4d;");
		pane.setPadding(new Insets(10, 10, 10, 10));
		text.setPadding(new Insets(10, 10, 10, 10));
		text.setPrefWidth(320);
		text.setStyle(
				"-fx-border-width: 5px; -fx-border-color: #4d4d4d; -fx-background-color: BLACK; -fx-text-fill: white; -fx-font-size: 30");
		pane.getChildren().add(text);

		Button zero = new Button("0");
		zero.setOnAction((event) -> {
			text.appendText("0");
		});
		zero.setStyle("-fx-font-size: 20");
		zero.setPrefSize(100, 43);

		Button one = new Button("1");
		one.setOnAction((event) -> {
			text.appendText("1");
		});
		one.setStyle("-fx-font-size: 20");
		one.setPrefSize(100, 43);

		Button two = new Button("2");
		two.setOnAction((event) -> {
			text.appendText("2");
		});
		two.setStyle("-fx-font-size: 20");
		two.setPrefSize(100, 43);

		Button three = new Button("3");
		three.setOnAction((event) -> {
			text.appendText("3");
		});
		three.setStyle("-fx-font-size: 20");
		three.setPrefSize(100, 43);

		Button four = new Button("4");
		four.setOnAction((event) -> {
			text.appendText("4");
		});
		four.setStyle("-fx-font-size: 20");
		four.setPrefSize(100, 43);

		Button five = new Button("5");
		five.setOnAction((event) -> {
			text.appendText("5");
		});
		five.setStyle("-fx-font-size: 20");
		five.setPrefSize(100, 43);

		Button six = new Button("6");
		six.setOnAction((event) -> {
			text.appendText("6");
		});
		six.setStyle("-fx-font-size: 20");
		six.setPrefSize(100, 43);

		Button seven = new Button("7");
		seven.setOnAction((event) -> {
			text.appendText("7");
		});
		seven.setStyle("-fx-font-size: 20");
		seven.setPrefSize(100, 43);

		Button eight = new Button("8");
		eight.setOnAction((event) -> {
			text.appendText("8");
		});
		eight.setStyle("-fx-font-size: 20");
		eight.setPrefSize(100, 43);

		Button nine = new Button("9");
		nine.setOnAction((event) -> {
			text.appendText("9");
		});
		nine.setStyle("-fx-font-size: 20");
		nine.setPrefSize(100, 43);

		Button add = new Button("+");
		add.setOnAction((event) -> {
			number1 = number_reader();
			text.setText("");
			addc = 1;
			divc = 0;
			mulc = 0;
			subc = 0;
			powc = 0;
			sqrtc = 0;
		});
		add.setStyle("-fx-font-size: 20");
		add.setPrefSize(100, 43);

		Button sub = new Button("-");
		sub.setOnAction((event) -> {
			number1 = number_reader();
			text.setText("");
			addc = 0;
			divc = 0;
			mulc = 0;
			subc = 1;
			powc = 0;
			sqrtc = 0;
		});
		sub.setStyle("-fx-font-size: 20");
		sub.setPrefSize(100, 43);

		Button mult = new Button("*");
		mult.setOnAction((event) -> {
			number1 = number_reader();
			text.setText("");
			addc = 0;
			divc = 0;
			mulc = 1;
			subc = 0;
			powc = 0;
			sqrtc = 0;
		});
		mult.setStyle("-fx-font-size: 20");
		mult.setPrefSize(100, 43);

		Button div = new Button("/");
		div.setOnAction((event) -> {
			number1 = number_reader();
			text.setText("");
			addc = 0;
			divc = 1;
			mulc = 0;
			subc = 0;
			powc = 0;
			sqrtc = 0;
		});
		div.setStyle("-fx-font-size: 20");
		div.setPrefSize(100, 43);

		Button equal = new Button("=");
		equal.setOnAction((event) -> {
			number2 = number_reader();

			if (addc > 0) {
				result = number1 + number2;
				text.setText(Double.toString(result));
			}
			if (subc > 0) {
				result = number1 - number2;
				text.setText(Double.toString(result));
			}
			if (mulc > 0) {
				result = number1 * number2;
				text.setText(Double.toString(result));
			}
			if (divc > 0) {
				result = number1 / number2;
				text.setText(Double.toString(result));
			}
			if (powc > 0) {
				result = Math.pow(number1, number2);
				text.setText(Double.toString(result));
			}
			;
		});
		equal.setStyle("-fx-font-size: 20");
		equal.setPrefSize(100, 43);

		Button decimal = new Button(".");
		decimal.setOnAction((event) -> {
			text.appendText(".");
		});
		decimal.setStyle("-fx-font-size: 20");
		decimal.setPrefSize(100, 43);

		Button pow = new Button("pow");
		pow.setOnAction((event) -> {
			number1 = number_reader();
			text.setText("");
			addc = 0;
			divc = 0;
			mulc = 0;
			subc = 0;
			powc = 1;
			sqrtc = 0;
		});
		pow.setStyle("-fx-font-size: 20");
		pow.setPrefSize(100, 43);

		Button sqrt = new Button("sqrt");
		sqrt.setOnAction((event) -> {
			number1 = number_reader();
			result = Math.sqrt(number1);
			text.setText(Double.toString(result));
			addc = 0;
			divc = 0;
			mulc = 0;
			subc = 0;
			powc = 0;
			sqrtc = 1;
		});
		sqrt.setStyle("-fx-font-size: 20");
		sqrt.setPrefSize(100, 43);

		Button clear = new Button("C");
		clear.setOnAction((event) -> {
			text.clear();
		});
		clear.setStyle("-fx-font-size: 20");
		clear.setPrefSize(320, 43);

		pane.setVgap(10);
		pane.setHgap(10);

		pane.getChildren().add(zero);
		pane.getChildren().add(one);
		pane.getChildren().add(two);
		pane.getChildren().add(three);
		pane.getChildren().add(four);
		pane.getChildren().add(five);
		pane.getChildren().add(six);
		pane.getChildren().add(seven);
		pane.getChildren().add(eight);
		pane.getChildren().add(nine);
		pane.getChildren().add(add);
		pane.getChildren().add(sub);
		pane.getChildren().add(mult);
		pane.getChildren().add(div);
		pane.getChildren().add(equal);
		pane.getChildren().add(decimal);
		pane.getChildren().add(pow);
		pane.getChildren().add(sqrt);
		pane.getChildren().add(clear);

		Scene scene = new Scene(pane);

		primaryStage.setResizable(false);
		primaryStage.setTitle("Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

	public double number_reader() {
		double num1;
		String s;
		s = text.getText();
		num1 = Double.valueOf(s);
		return num1;
	}

}
