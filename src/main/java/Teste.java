import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.example.myservice.CalculatorSoap;

public class Teste {

	public static void main(String[] args) throws MalformedURLException {
		QName qname = new QName("http://tempuri.org/", "Calculator");

		Service service = Service
				.create(new URL(
						"http://www.html2xml.nl/Services/Calculator/Version1/Calculator.asmx?WSDL"),
						qname);

		CalculatorSoap calculator = service.getPort(CalculatorSoap.class);

		System.out.println(calculator.add(10, 20));

	}
}
