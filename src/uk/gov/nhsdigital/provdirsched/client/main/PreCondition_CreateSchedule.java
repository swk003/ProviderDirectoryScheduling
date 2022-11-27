package uk.gov.nhsdigital.provdirsched.client.main;

import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Coding;
import org.hl7.fhir.dstu3.model.DateTimeType;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.Meta;
import org.hl7.fhir.dstu3.model.Period;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Schedule;


public class PreCondition_CreateSchedule {
	
	@SuppressWarnings({ "unchecked", "deprecation", "rawtypes" })
	
	public static Schedule createSchedule(){
		
		//"modifierExtension" to be added
		final Schedule sched = new Schedule();
		
		sched.setId("13daadee-26e1-4d6a-9e6a-7f4af9b58877");
		
		Meta meta = new Meta();
		meta.addProfile("https://fhir.nhs.uk/StructureDefinition/gpconnect-schedule-1");
		sched.setMeta(meta);
		
		// Not used in GP Connect example
		Identifier rr5 = new Identifier();
		rr5.setSystem("http://fhir.nhs.net/Id/gpconnect-schedule-identifier").setValue("Schedule002");
		sched.addIdentifier(rr5);
		
		sched.setActive(Boolean.TRUE);
		
		CodeableConcept servtype = (CodeableConcept) sched.getServiceTypeFirstRep().addCoding(new Coding().setSystem("http://hl7.org/fhir/ValueSet/c80-practice-codes").setCode("394802001").setDisplay("General medicine"));
		servtype.setText("General medicine");
		
		sched.addActor(new Reference().setReference("Location/4957"));
		sched.addActor(new Reference().setReference("Practitioner/4955"));
		sched.setPlanningHorizon(new Period().setStartElement(new DateTimeType("2017-01-15T09:00:00+00:00")).setEndElement(new DateTimeType("2017-01-29T17:59:59+00:00")));
		sched.setComment("Schedule 2 for general appointments");
		return sched;

	}

}