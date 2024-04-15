package com.ps;

public class futureValue {
    InvestCalc extends Application {

        private TextField tfInvestmentAmount = new TextField();
        private TextField tfNumYears = new TextField();
        private TextField tfAnnualIntRate = new TextField();
        private TextField tfFutureValue = new TextField();
        private Button btCalculate = new Button("Calculate");
    }

        @Override
        public void start(Stage primaryStage) {

            GridPane gridPane = new GridPane();
            gridPane.setHgap(5);
            gridPane.setVgap(5);
            gridPane.add(new Label("Investment Amount: "), 0, 0);
            gridPane.add(tfInvestmentAmount, 1, 0);
            gridPane.add(new Label("Number of Years: "), 0, 1);
            gridPane.add(tfNumYears, 1, 1);
            gridPane.add(new Label("Annual Intrest Rate: "), 0, 2);
            gridPane.add(tfAnnualIntRate, 1, 2);
            gridPane.add(new Label("Future Value: "), 0, 3);
            gridPane.add(tfFutureValue, 1, 3);
            gridPane.add(btCalculate, 1, 4);

            gridPane.setAlignment(Pos.BASELINE_CENTER);
            tfInvestmentAmount.setAlignment(Pos.BOTTOM_RIGHT);
            tfNumYears.setAlignment(Pos.BOTTOM_RIGHT);
            tfAnnualIntRate.setAlignment(Pos.BOTTOM_RIGHT);
            tfFutureValue.setAlignment(Pos.BOTTOM_RIGHT);
            tfFutureValue.setEditable(false);
            GridPane.setHalignment(btCalculate, HPos.RIGHT);

            btCalculate.setOnAction(e -> calculateInvestment());

            Scene scene = new Scene(gridPane, 400, 250);
            primaryStage.setTitle("Investment Calculator");
            primaryStage.setScene(scene);
            primaryStage.show();
        }

        private void calculateInvestment() {
            double annualIntrest = Double.parseDouble(tfAnnualIntRate.getText());
            int numYears = Integer.parseInt(tfNumYears.getText());
            double investAmount = Double.parseDouble(tfInvestmentAmount.getText());

            double value = investAmount * Math.pow(1 + annualIntrest, numYears *12);

            tfFutureValue.setText("$%.2f" + value);
        }

        public static void main(String[] args) {
            launch(args);
        }

    }
}
