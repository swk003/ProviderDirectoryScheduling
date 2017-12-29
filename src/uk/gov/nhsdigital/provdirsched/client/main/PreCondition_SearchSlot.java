package uk.gov.nhsdigital.provdirsched.client.main;

import org.hl7.fhir.dstu3.model.Bundle;
import org.hl7.fhir.dstu3.model.DateTimeType;
import org.hl7.fhir.dstu3.model.Parameters;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.StringType;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.client.IGenericClient;
import ca.uhn.fhir.rest.client.interceptor.LoggingInterceptor;

import org.hl7.fhir.dstu3.model.Parameters.ParametersParameterComponent;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.Period;

public class PreCondition_SearchSlot {

	
	public static Parameters BookSlotParameters(){
		
		final Parameters bookslotparam = new Parameters();
		
		//POST /Slot/[id]/$book
		ParametersParameterComponent bsp = new ParametersParameterComponent();
		bsp.setName("patient");
		bsp.setValue(new Reference().setReference("Patient/1").setDisplay("SMITH, Mike (Mr)"));
		bsp.setName("reason");
		bsp.setValue(new StringType("Feel unwell"));
		bookslotparam.addParameter(bsp);
		
	
	/*	POST /Slot/[id]/$book
		{
			"resourceType": "Parameters",
			"parameter": [{
				"name": "patient",
				"valueReference": {
					"reference": "Patient/1",
					"display": "SMITH, Mike (Mr)"
				},
				{
				"name": "reason",
				"valueString": "Feel unwell"
			}]
		}*/

		return bookslotparam;
	
	}
	
	
public static Parameters GetScheduleSlotParameters(){
		
		final Parameters getschedulelotparam = new Parameters();
		
		//*POST /Organization/[id]/$gpc.getschedule
		ParametersParameterComponent bsp = new ParametersParameterComponent();
		bsp.setName("timePeriod");
		bsp.setValue(new Period().setStartElement(new DateTimeType("2016-08-08")).setEndElement(new DateTimeType("2016-08-22")));
		getschedulelotparam.addParameter(bsp);

		/*POST /Organization/[id]/$gpc.getschedule
		{
			"resourceType": "Parameters",
			"parameter": [{
				"name": "timePeriod",
				"valuePeriod": {
					"start": "2016-08-08",
					"end": "2016-08-22"
				}
			}]
		}*/


		return getschedulelotparam;
	
	}
	
	
	

		public static void MHDClientSearch1() {

			//See: http://hapifhir.io/doc_rest_client.html#SearchQuery_-_Type

			FhirContext ctx = FhirContext.forDstu3();
			IGenericClient client = ctx.newRestfulGenericClient("http://fhirtest.uhn.ca/baseDstu3");

			//Log requests and responses (verbose testing)
			client.registerInterceptor(new LoggingInterceptor(true));

			//build a search and execute it
			Bundle response = client.search()
		.forResource(Patient.class)
		.where(Patient.NAME.matches().value("Test"))
		.and(Patient.BIRTHDATE.before().day("2014-01-01"))
		.count(100)
		.returnBundle(Bundle.class)
		.execute();

			//how many resources did we find?
			System.out.println("Responses:" + response.getTotal());

			//Print the Id of the first one
			System.out.println(response.getEntry().get(0).getResource().getId());
	
}

	
	
	/*
	Or better still a FHIR REST call:

		GET /Schedule?date=01-01-2017
	 &date=14-01-2017
	 &include=Schedule:actor:Practitioner
	 &include=Schedule:actor:Location
	 &revinclude=Slot:schedule
*/

	
	
	
}
