package uk.gov.nhsdigital.provdirsched.client.main;

import org.hl7.fhir.dstu3.model.Appointment;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Coding;
import org.hl7.fhir.dstu3.model.DateTimeType;
import org.hl7.fhir.dstu3.model.InstantType;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Slot;
import org.hl7.fhir.dstu3.model.Slot.SlotStatus;

public class PreCondition_CreateSlot {
	
	public static Slot CreateSlot(){
		
		final Slot slot1 = new Slot();
		
		slot1.setId("13daadee-26e1-4d6a-9e6a-7f4af9b58877");
		
		CodeableConcept servtype = (CodeableConcept) slot1.getServiceTypeFirstRep().addCoding(new Coding().setSystem("http://hl7.org/fhir/ValueSet/c80-practice-codes").setCode("394802001").setDisplay("General medicine"));
		servtype.setText("General medicine");
		slot1.setSchedule(new Reference().setReference("Schedule/4958"));
		slot1.setStatus(SlotStatus.FREE);
		slot1.setStartElement(new InstantType("2017-01-01T09:00:00+00:00"));
		slot1.setEndElement(new InstantType("2017-01-01T10:00:00+00:00"));
		slot1.setOverbooked(Boolean.FALSE);
		slot1.setComment("Schedule 1 for general appointments");
		
		return slot1;
		
	}

}
