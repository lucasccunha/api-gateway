package br.com.lucas.api_gateway.math;

import org.springframework.stereotype.Component;

@Component
public class SimpleMath {

        public Double sum(Double numberOne, Double numberTwo) {
            return numberOne +  numberTwo;
        }

        public Double subtraction(Double numberOne, Double numberTwo) {
            return numberOne -  numberTwo;
        }

        public Double multiplication(Double numberOne, Double numberTwo) {
            return numberOne * numberTwo;
        }

        public Double divide(Double numberOne, Double numberTwo) {
            return numberOne / numberTwo;
        }

        public Double average(Double numberOne, Double numberTwo) {
            return (numberOne +  numberTwo) / 2;
        }

        public Double sqrt(Double number) {
            return Math.sqrt(number);
        }
}
