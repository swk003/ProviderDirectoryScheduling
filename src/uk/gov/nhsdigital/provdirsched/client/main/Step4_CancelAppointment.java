package uk.gov.nhsdigital.provdirsched.client.main;

import org.hl7.fhir.dstu3.model.Appointment;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Coding;
import org.hl7.fhir.dstu3.model.DateTimeType;
import org.hl7.fhir.dstu3.model.Meta;
import org.hl7.fhir.dstu3.model.Parameters;
import org.hl7.fhir.dstu3.model.Period;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.StringType;
import org.hl7.fhir.dstu3.model.Appointment.AppointmentParticipantComponent;
import org.hl7.fhir.dstu3.model.Appointment.ParticipantRequired;
import org.hl7.fhir.dstu3.model.Parameters.ParametersParameterComponent;

public class Step4_CancelAppointment {
	
	@SuppressWarnings({ "unchecked", "deprecation", "rawtypes" })
	public static Appointment cancelAppointment(){
		
		final Appointment cancappt = new Appointment();
		
		cancappt.setId("13daadee-26e1-4d6a-9e6a-7f4af9b58877");
		
		Meta meta = new Meta();
		meta.addProfile("https://fhir.nhs.uk/StructureDefinition/GPConnect-Appointment-1");
		cancappt.setMeta(meta);
		
		// Not used in GP Connect example
		/*Identifier rr5 = new Identifier();
		rr5.setSystem(" http://www.acme.com/identifiers/patient").setValue("b18f24b7-e72c-44c0-bdf4-7e45d06db1b6");
		appt.addIdentifier(rr5);*/
		
		cancappt.setStatus(org.hl7.fhir.dstu3.model.Appointment.AppointmentStatus.CANCELLED);
		
		CodeableConcept appttype = (CodeableConcept) cancappt.getAppointmentType().addCoding(new Coding().setSystem("http://hl7.org/fhir/ValueSet/c80-practice-codes").setCode("408443003"));
		appttype.setText("GP");
		//REASON
		CodeableConcept reastype = (CodeableConcept) cancappt.getReasonFirstRep();
		reastype.setText("Free text reason.");
		cancappt.setDescription("Free text description.");
		cancappt.addSlot(new Reference().setReference("Slot/1").setDisplay("Slot 1"));
		cancappt.setComment("Free text description.");
		
		AppointmentParticipantComponent part1 = new AppointmentParticipantComponent();
		CodeableConcept part1type = (CodeableConcept) part1.getTypeFirstRep().addCoding(new Coding().setSystem("http://hl7.org/fhir/ValueSet/encounter-participant-type").setCode("SBJ"));
		part1type.setText("Subject");
		part1.setActor(new Reference().setReference("Patient/1").setDisplay("Mr. Mike Smith"));
		part1.setRequired(ParticipantRequired.REQUIRED);
		part1.setStatus(org.hl7.fhir.dstu3.model.Appointment.ParticipationStatus.ACCEPTED);
		cancappt.addParticipant(part1);
		
		//BROKEN
		//cancappt.setStatus(org.hl7.fhir.dstu3.model.Appointment.AppointmentStatus.BOOKED);
		
		AppointmentParticipantComponent part2 = new AppointmentParticipantComponent();
		CodeableConcept part2type = (CodeableConcept) part2.getTypeFirstRep().addCoding(new Coding().setSystem("http://hl7.org/fhir/ValueSet/encounter-participant-type").setCode("PPRF"));
		part2type.setText("Primary Performer");
		part2.setActor(new Reference().setReference("Practitioner/100").setDisplay("Dr. Bob Smith"));
		part2.setRequired(ParticipantRequired.REQUIRED);
		part2.setStatus(org.hl7.fhir.dstu3.model.Appointment.ParticipationStatus.ACCEPTED);
		cancappt.addParticipant(part2);
		
		cancappt.addRequestedPeriod(new Period().setStartElement(new DateTimeType("2017-06-23T11:20:53+02:00")).setEndElement(new DateTimeType("2017-06-23T11:20:53+02:00")));

	   return cancappt;
		
	}

	@SuppressWarnings({ "unchecked", "deprecation", "rawtypes" })
	public static Parameters CancelAppointmentParameters(){
		
		//PUT /Appointment/[id]/$cancel
		final Parameters cancapptparam = new Parameters();
		
		ParametersParameterComponent ppc = new ParametersParameterComponent();
		ppc.setName("cancellationReason");
		ppc.setValue(new StringType("Feel better"));
	
	/*	PUT /Appointment/[id]/$cancel
	{
		"resourceType": "Parameters",
		"parameter": [{
			{
			"name": "cancellationReason",
			"valueString": "Feel better"
		}]
	}
*/

		return cancapptparam;
	
	
}
	
}
