package uk.gov.nhsdigital.provdirsched.client.main;


import org.hl7.fhir.dstu3.model.DocumentReference;
import org.hl7.fhir.dstu3.model.Patient;
import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.api.MethodOutcome;
import ca.uhn.fhir.rest.client.IGenericClient;
import ca.uhn.fhir.rest.client.interceptor.LoggingInterceptor;
import org.hl7.fhir.dstu3.model.Appointment;

public class ProvDirSchedClient {
	
	
	 public static void CreateStep2_BookAppointment() {
			
			// create a context for DSTU2
			FhirContext ctx = FhirContext.forDstu3();
			
			org.hl7.fhir.dstu3.model.Appointment creatappt = Step2_BookAppointment.createAppointment();
			// We can now use a parser to encode this resource into a string.
			String output = ctx.newXmlParser().setPrettyPrint(true).encodeResourceToString(creatappt);
			
			System.out.println(output);
			
			/*//create client
			//String serverBaseUrl = "http://localhost:8080/hapi-fhir-jpaserver-example/baseDstu3";
			String serverBaseUrl = "http://fhirtest.uhn.ca/baseDstu3";
			//String serverBaseUrl = "http://fhir3.healthintersections.com.au/open";
			//String serverBaseUrl = "http://phh-l-iopweb-l1:8080/hapi-fhir-jpaserver/baseDstu2";
			IGenericClient client = ctx.newRestfulGenericClient(serverBaseUrl);
					
			//use client to store a new resource instance
			MethodOutcome outcome = client.create().resource(docref).execute();
			System.out.println(outcome.getId());
			//create client
*/			
			/*
			//String serverBaseUrl = "http://localhost:8080/hapi-fhir-jpaserver-example/baseDstu3";
			String serverBaseUrl = "http://fhirtest.uhn.ca/baseDstu3";
			//String serverBaseUrl = "http://fhir3.healthintersections.com.au/open";
			IGenericClient client = ctx.newRestfulGenericClient(serverBaseUrl);
			
			//use client to execute a transaction by manually creating and passing in a populated bundle
			Bundle outcome = client.transaction().withBundle(bndl).execute();
			System.out.println(outcome.getId());*/
			
			
		}
	 
	 
	 public static void CreateStep2_CreateSlotParameters() {
			
			// create a context for DSTU2
			FhirContext ctx = FhirContext.forDstu3();
			
			org.hl7.fhir.dstu3.model.Parameters bookslotparam = Step2_BookAppointment.CreateSlotParameters();
			// We can now use a parser to encode this resource into a string.
			String output = ctx.newXmlParser().setPrettyPrint(true).encodeResourceToString(bookslotparam);
			
			System.out.println(output);
			
			/*//create client
			//String serverBaseUrl = "http://localhost:8080/hapi-fhir-jpaserver-example/baseDstu3";
			String serverBaseUrl = "http://fhirtest.uhn.ca/baseDstu3";
			//String serverBaseUrl = "http://fhir3.healthintersections.com.au/open";
			//String serverBaseUrl = "http://phh-l-iopweb-l1:8080/hapi-fhir-jpaserver/baseDstu2";
			IGenericClient client = ctx.newRestfulGenericClient(serverBaseUrl);
					
			//use client to store a new resource instance
			MethodOutcome outcome = client.create().resource(docref).execute();
			System.out.println(outcome.getId());
			//create client
*/			
			/*
			//String serverBaseUrl = "http://localhost:8080/hapi-fhir-jpaserver-example/baseDstu3";
			String serverBaseUrl = "http://fhirtest.uhn.ca/baseDstu3";
			//String serverBaseUrl = "http://fhir3.healthintersections.com.au/open";
			IGenericClient client = ctx.newRestfulGenericClient(serverBaseUrl);
			
			//use client to execute a transaction by manually creating and passing in a populated bundle
			Bundle outcome = client.transaction().withBundle(bndl).execute();
			System.out.println(outcome.getId());*/
			
			
		}
	 
	 
	 public static void CreatePreCondition_CreateSchedule() {
			
			// create a context for DSTU2
			FhirContext ctx = FhirContext.forDstu3();
			
			org.hl7.fhir.dstu3.model.Schedule creatsched = PreCondition_CreateSchedule.createSchedule();
			// We can now use a parser to encode this resource into a string.
			String output = ctx.newXmlParser().setPrettyPrint(true).encodeResourceToString(creatsched);
			
			System.out.println(output);
			
			//create client
			//String serverBaseUrl = "http://localhost:8080/hapi-fhir-jpaserver-example/baseDstu3";
			//String serverBaseUrl = "http://fhirtest.uhn.ca/baseDstu3";
			String serverBaseUrl = "http://localhost:8080/hapi-fhir-jpaserver-example/baseDstu3";
			//String serverBaseUrl = "http://fhir3.healthintersections.com.au/open";
			//String serverBaseUrl = "http://phh-l-iopweb-l1:8080/hapi-fhir-jpaserver/baseDstu2";
			IGenericClient client = ctx.newRestfulGenericClient(serverBaseUrl);
					
			//use client to store a new resource instance
			MethodOutcome outcome = client.create().resource(creatsched).execute();
			System.out.println(outcome.getId());
			//create client
		
			/*
			//String serverBaseUrl = "http://localhost:8080/hapi-fhir-jpaserver-example/baseDstu3";
			String serverBaseUrl = "http://fhirtest.uhn.ca/baseDstu3";
			//String serverBaseUrl = "http://fhir3.healthintersections.com.au/open";
			IGenericClient client = ctx.newRestfulGenericClient(serverBaseUrl);
			
			//use client to execute a transaction by manually creating and passing in a populated bundle
			Bundle outcome = client.transaction().withBundle(bndl).execute();
			System.out.println(outcome.getId());*/
		
			
		}
			
	 
	 public static void CreatePreCondition_BookSlotParameters() {
			
			// create a context for DSTU2
			FhirContext ctx = FhirContext.forDstu3();
			
			org.hl7.fhir.dstu3.model.Parameters creatsched =  PreCondition_SearchSlot.BookSlotParameters();
			// We can now use a parser to encode this resource into a string.
			String output = ctx.newXmlParser().setPrettyPrint(true).encodeResourceToString(creatsched);
			
			System.out.println(output);
			
			/*//create client
			//String serverBaseUrl = "http://localhost:8080/hapi-fhir-jpaserver-example/baseDstu3";
			String serverBaseUrl = "http://fhirtest.uhn.ca/baseDstu3";
			//String serverBaseUrl = "http://fhir3.healthintersections.com.au/open";
			//String serverBaseUrl = "http://phh-l-iopweb-l1:8080/hapi-fhir-jpaserver/baseDstu2";
			IGenericClient client = ctx.newRestfulGenericClient(serverBaseUrl);
					
			//use client to store a new resource instance
			MethodOutcome outcome = client.create().resource(docref).execute();
			System.out.println(outcome.getId());
			//create client
*/			
			/*
			//String serverBaseUrl = "http://localhost:8080/hapi-fhir-jpaserver-example/baseDstu3";
			String serverBaseUrl = "http://fhirtest.uhn.ca/baseDstu3";
			//String serverBaseUrl = "http://fhir3.healthintersections.com.au/open";
			IGenericClient client = ctx.newRestfulGenericClient(serverBaseUrl);
			
			//use client to execute a transaction by manually creating and passing in a populated bundle
			Bundle outcome = client.transaction().withBundle(bndl).execute();
			System.out.println(outcome.getId());*/
		
			
		}
	 
	 
	 public static void CreatePreCondition_GetScheduleSlotParameters() {
			
			// create a context for DSTU2
			FhirContext ctx = FhirContext.forDstu3();
			
			org.hl7.fhir.dstu3.model.Parameters creatsched =  PreCondition_SearchSlot.GetScheduleSlotParameters();
			// We can now use a parser to encode this resource into a string.
			String output = ctx.newXmlParser().setPrettyPrint(true).encodeResourceToString(creatsched);
			
			System.out.println(output);
			
			/*//create client
			//String serverBaseUrl = "http://localhost:8080/hapi-fhir-jpaserver-example/baseDstu3";
			String serverBaseUrl = "http://fhirtest.uhn.ca/baseDstu3";
			//String serverBaseUrl = "http://fhir3.healthintersections.com.au/open";
			//String serverBaseUrl = "http://phh-l-iopweb-l1:8080/hapi-fhir-jpaserver/baseDstu2";
			IGenericClient client = ctx.newRestfulGenericClient(serverBaseUrl);
					
			//use client to store a new resource instance
			MethodOutcome outcome = client.create().resource(docref).execute();
			System.out.println(outcome.getId());
			//create client
*/			
			/*
			//String serverBaseUrl = "http://localhost:8080/hapi-fhir-jpaserver-example/baseDstu3";
			String serverBaseUrl = "http://fhirtest.uhn.ca/baseDstu3";
			//String serverBaseUrl = "http://fhir3.healthintersections.com.au/open";
			IGenericClient client = ctx.newRestfulGenericClient(serverBaseUrl);
			
			//use client to execute a transaction by manually creating and passing in a populated bundle
			Bundle outcome = client.transaction().withBundle(bndl).execute();
			System.out.println(outcome.getId());*/
		
			
		}
	 
	 
	 
	 public static void CreateStep4_CancelAppointment() {
			
			// create a context for DSTU2
			FhirContext ctx = FhirContext.forDstu3();
			
			org.hl7.fhir.dstu3.model.Appointment cancelappt = Step4_CancelAppointment.cancelAppointment();
			// We can now use a parser to encode this resource into a string.
			String output = ctx.newXmlParser().setPrettyPrint(true).encodeResourceToString(cancelappt);
			
			System.out.println(output);
			
			/*//create client
			//String serverBaseUrl = "http://localhost:8080/hapi-fhir-jpaserver-example/baseDstu3";
			String serverBaseUrl = "http://fhirtest.uhn.ca/baseDstu3";
			//String serverBaseUrl = "http://fhir3.healthintersections.com.au/open";
			//String serverBaseUrl = "http://phh-l-iopweb-l1:8080/hapi-fhir-jpaserver/baseDstu2";
			IGenericClient client = ctx.newRestfulGenericClient(serverBaseUrl);
					
			//use client to store a new resource instance
			MethodOutcome outcome = client.create().resource(docref).execute();
			System.out.println(outcome.getId());
			//create client
*/			
			/*
			//String serverBaseUrl = "http://localhost:8080/hapi-fhir-jpaserver-example/baseDstu3";
			String serverBaseUrl = "http://fhirtest.uhn.ca/baseDstu3";
			//String serverBaseUrl = "http://fhir3.healthintersections.com.au/open";
			IGenericClient client = ctx.newRestfulGenericClient(serverBaseUrl);
			
			//use client to execute a transaction by manually creating and passing in a populated bundle
			Bundle outcome = client.transaction().withBundle(bndl).execute();
			System.out.println(outcome.getId());*/
			
			
		}
	 
	 
	 public static void CreateStep5_AmendAppointment() {
			
			// create a context for DSTU2
			FhirContext ctx = FhirContext.forDstu3();
			
			org.hl7.fhir.dstu3.model.Appointment cancelappt = Step5_AmendAppointment.AmendAppointment();
			// We can now use a parser to encode this resource into a string.
			String output = ctx.newXmlParser().setPrettyPrint(true).encodeResourceToString(cancelappt);
			
			System.out.println(output);
			
			/*//create client
			//String serverBaseUrl = "http://localhost:8080/hapi-fhir-jpaserver-example/baseDstu3";
			String serverBaseUrl = "http://fhirtest.uhn.ca/baseDstu3";
			//String serverBaseUrl = "http://fhir3.healthintersections.com.au/open";
			//String serverBaseUrl = "http://phh-l-iopweb-l1:8080/hapi-fhir-jpaserver/baseDstu2";
			IGenericClient client = ctx.newRestfulGenericClient(serverBaseUrl);
					
			//use client to store a new resource instance
			MethodOutcome outcome = client.create().resource(docref).execute();
			System.out.println(outcome.getId());
			//create client
*/			
			/*
			//String serverBaseUrl = "http://localhost:8080/hapi-fhir-jpaserver-example/baseDstu3";
			String serverBaseUrl = "http://fhirtest.uhn.ca/baseDstu3";
			//String serverBaseUrl = "http://fhir3.healthintersections.com.au/open";
			IGenericClient client = ctx.newRestfulGenericClient(serverBaseUrl);
			
			//use client to execute a transaction by manually creating and passing in a populated bundle
			Bundle outcome = client.transaction().withBundle(bndl).execute();
			System.out.println(outcome.getId());*/
			
			
		}
	 
	 
	 public static void CreatePreCondition_CreateSlot() {
			
			// create a context for DSTU2
			FhirContext ctx = FhirContext.forDstu3();
			
			org.hl7.fhir.dstu3.model.Slot createslot = PreCondition_CreateSlot.CreateSlot();
			// We can now use a parser to encode this resource into a string.
			String output = ctx.newXmlParser().setPrettyPrint(true).encodeResourceToString(createslot);
			
			System.out.println(output);
			
			//create client
			//String serverBaseUrl = "http://localhost:8080/hapi-fhir-jpaserver-example/baseDstu3";
			 String serverBaseUrl = "http://localhost:8080/hapi-fhir-jpaserver-example/baseDstu3";
			//String serverBaseUrl = "http://fhirtest.uhn.ca/baseDstu3";
			//String serverBaseUrl = "http://fhir3.healthintersections.com.au/open";
			//String serverBaseUrl = "http://phh-l-iopweb-l1:8080/hapi-fhir-jpaserver/baseDstu2";
			IGenericClient client = ctx.newRestfulGenericClient(serverBaseUrl);
					
			//use client to store a new resource instance
			MethodOutcome outcome = client.create().resource(createslot).execute();
			System.out.println(outcome.getId());
			//create client
			
			/*
			//String serverBaseUrl = "http://localhost:8080/hapi-fhir-jpaserver-example/baseDstu3";
			String serverBaseUrl = "http://fhirtest.uhn.ca/baseDstu3";
			//String serverBaseUrl = "http://fhir3.healthintersections.com.au/open";
			IGenericClient client = ctx.newRestfulGenericClient(serverBaseUrl);
			
			//use client to execute a transaction by manually creating and passing in a populated bundle
			Bundle outcome = client.transaction().withBundle(bndl).execute();
			System.out.println(outcome.getId());*/
			
			
		}
	 
	 
	 public static void CreatePreCondition_Location() {
			
			// create a context for DSTU2
			FhirContext ctx = FhirContext.forDstu3();
			
			org.hl7.fhir.dstu3.model.Location createloc = PreCondition_Location.CreateLocation();
			// We can now use a parser to encode this resource into a string.
			String output = ctx.newXmlParser().setPrettyPrint(true).encodeResourceToString(createloc);
			
			System.out.println(output);
			
			//create client
			//String serverBaseUrl = "http://localhost:8080/hapi-fhir-jpaserver-example/baseDstu3";
			//String serverBaseUrl = "http://fhirtest.uhn.ca/baseDstu3";
			String serverBaseUrl = "http://localhost:8080/hapi-fhir-jpaserver-example/baseDstu3";
			//String serverBaseUrl = "http://fhir3.healthintersections.com.au/open";
			//String serverBaseUrl = "http://phh-l-iopweb-l1:8080/hapi-fhir-jpaserver/baseDstu2";
			IGenericClient client = ctx.newRestfulGenericClient(serverBaseUrl);
					
			//use client to store a new resource instance
			MethodOutcome outcome = client.create().resource(createloc).execute();
			System.out.println(outcome.getId());
			//create client
			
			/*
			//String serverBaseUrl = "http://localhost:8080/hapi-fhir-jpaserver-example/baseDstu3";
			String serverBaseUrl = "http://fhirtest.uhn.ca/baseDstu3";
			//String serverBaseUrl = "http://fhir3.healthintersections.com.au/open";
			IGenericClient client = ctx.newRestfulGenericClient(serverBaseUrl);
			
			//use client to execute a transaction by manually creating and passing in a populated bundle
			Bundle outcome = client.transaction().withBundle(bndl).execute();
			System.out.println(outcome.getId());*/
			
			
		}
	 
	/*		public static void MHDClientSearch1() {
				
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
			
			
			
		public static void MHDClientSearch2() {
				
				//See: http://hapifhir.io/doc_rest_client.html#SearchQuery_-_Type
			
				//Location: http://fhirtest.uhn.ca/baseDstu3/Bundle/216923/_history/1[\r][\n]"
				
				FhirContext ctx = FhirContext.forDstu3();
				IGenericClient client = ctx.newRestfulGenericClient("https://fhirtest.uhn.ca/baseDstu3");
				//IGenericClient client = ctx.newRestfulGenericClient("https://fhirtest.uhn.ca/baseDstu2");
				
				//Log requests and responses (verbose testing)
				client.registerInterceptor(new LoggingInterceptor(true));
				
				//build a search and execute it
				Bundle response = client.search()
						.forResource(DocumentReference.class)
						//.where(DocumentReference.TYPE.hasSystemWithAnyCode("http://snomed.info/sct"))
						.where(DocumentReference.IDENTIFIER.exactly().identifier("212867"))
						.where(DocumentReference.SUBJECT.hasId("Patient/17895"))
						//.where(DocumentReference.NAME.matches().value("Test"))
						.and(DocumentReference.INDEXED.exactly().day("2015-02-17"))
						//.and(DocumentReference.INDEXED.before().day("2015-02-18"))
						//.and(DocumentReference.BIRTHDATE.before().day("2014-01-01"))
						.count(5)
						.returnBundle(Bundle.class)
						.execute();
				
				//how many resources did we find?
				System.out.println("Responses:" + response.getTotal());
				
				//Print the Id of the first one
				System.out.println(response.getEntry().get(0).getResource().getId());
					
			}


		//Search Works
		public static void MHDClientSearch3() {
			
			//See: http://hapifhir.io/doc_rest_client.html#SearchQuery_-_Type

			"GET /baseDstu3/DocumentReference?created=ge2016-03-08&created=le2016-03-09 HTTP/1.1[\r][\n]"
			Responses:1
			https://fhirtest.uhn.ca/baseDstu3/DocumentReference/212867/_history/1	
			
			FhirContext ctx = FhirContext.forDstu3();
			IGenericClient client = ctx.newRestfulGenericClient("https://fhirtest.uhn.ca/baseDstu3");
			
			//Log requests and responses (verbose testing)
			client.registerInterceptor(new LoggingInterceptor(true));
			
			//build a search and execute it
			Bundle response = client.search()
					.forResource(DocumentReference.class)
					.where(DocumentReference.CREATED.afterOrEquals().day("2016-03-08"))
					.and(DocumentReference.CREATED.beforeOrEquals().day("2016-03-09"))
					.count(5)
					.returnBundle(Bundle.class)
					.execute();
			
			//how many resources did we find?
			System.out.println("Responses:" + response.getTotal());
			
			//Print the Id of the first one
			System.out.println(response.getEntry().get(0).getResource().getId());
				
		}*/

			public static void main(String[] args) {

				//CreateStep2_BookAppointment();
				//CreateStep2_CreateSlotParameters();
				//CreatePreCondition_CreateSchedule();
				//CreatePreCondition_GetScheduleSlotParameters();
				//CreateStep4_CancelAppointment();
				//CreateStep5_AmendAppointment();
				//CreatePreCondition_CreateSlot() ;
				//CreatePreCondition_Location();
			
			}
			
	
	

}
