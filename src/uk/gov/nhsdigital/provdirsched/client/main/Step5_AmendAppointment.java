package uk.gov.nhsdigital.provdirsched.client.main;

import org.hl7.fhir.dstu3.model.Appointment;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Coding;
import org.hl7.fhir.dstu3.model.DateTimeType;
import org.hl7.fhir.dstu3.model.Meta;
import org.hl7.fhir.dstu3.model.Parameters;
import org.hl7.fhir.dstu3.model.Parameters.ParametersParameterComponent;

import ca.uhn.fhir.model.dstu2.resource.Parameters.Parameter;
import ca.uhn.fhir.model.primitive.StringDt;

import org.hl7.fhir.dstu3.model.Period;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.StringType;
import org.hl7.fhir.dstu3.model.Appointment.AppointmentParticipantComponent;
import org.hl7.fhir.dstu3.model.Appointment.ParticipantRequired;

public class Step5_AmendAppointment {

	@SuppressWarnings({ "unchecked", "deprecation", "rawtypes" })
	public static Appointment AmendAppointment(){
		
		final Appointment amendappt = new Appointment();
		
		amendappt.setId("13daadee-26e1-4d6a-9e6a-7f4af9b58877");
		
		Meta meta = new Meta();
		meta.addProfile("https://fhir.nhs.uk/StructureDefinition/GPConnect-Appointment-1");
		amendappt.setMeta(meta);
		
		// Not used in GP Connect example
		/*Identifier rr5 = new Identifier();
		rr5.setSystem(" http://www.acme.com/identifiers/patient").setValue("b18f24b7-e72c-44c0-bdf4-7e45d06db1b6");
		appt.addIdentifier(rr5);*/
		
		amendappt.setStatus(org.hl7.fhir.dstu3.model.Appointment.AppointmentStatus.PROPOSED);
		
		CodeableConcept appttype = (CodeableConcept) amendappt.getAppointmentType().addCoding(new Coding().setSystem("http://hl7.org/fhir/ValueSet/c80-practice-codes").setCode("408443003"));
		appttype.setText("GP");
		
		//REASON
		CodeableConcept reastype = (CodeableConcept) amendappt.getReasonFirstRep();
		reastype.setText("Free text reason.");
		amendappt.setDescription("Free text description.");
		amendappt.addSlot(new Reference().setReference("Slot/1").setDisplay("Slot 1"));
		amendappt.setComment("Free text description.");
		
		AppointmentParticipantComponent part1 = new AppointmentParticipantComponent();
		CodeableConcept part1type = (CodeableConcept) part1.getTypeFirstRep().addCoding(new Coding().setSystem("http://hl7.org/fhir/ValueSet/encounter-participant-type").setCode("SBJ"));
		part1type.setText("Subject");
		part1.setActor(new Reference().setReference("Patient/1").setDisplay("Mr. Mike Smith"));
		part1.setRequired(ParticipantRequired.REQUIRED);
		part1.setStatus(org.hl7.fhir.dstu3.model.Appointment.ParticipationStatus.ACCEPTED);
		amendappt.addParticipant(part1);
		
		//BROKEN
		//amendappt.setStatus(org.hl7.fhir.dstu3.model.Appointment.AppointmentStatus.BOOKED);
		
		AppointmentParticipantComponent part2 = new AppointmentParticipantComponent();
		CodeableConcept part2type = (CodeableConcept) part2.getTypeFirstRep().addCoding(new Coding().setSystem("http://hl7.org/fhir/ValueSet/encounter-participant-type").setCode("PPRF"));
		part2type.setText("Primary Performer");
		part2.setActor(new Reference().setReference("Practitioner/100").setDisplay("Dr. Bob Smith"));
		part2.setRequired(ParticipantRequired.REQUIRED);
		part2.setStatus(org.hl7.fhir.dstu3.model.Appointment.ParticipationStatus.ACCEPTED);
		amendappt.addParticipant(part2);
		
		amendappt.addRequestedPeriod(new Period().setStartElement(new DateTimeType("2017-06-23T11:20:53+02:00")).setEndElement(new DateTimeType("2017-06-23T11:20:53+02:00")));

	   return amendappt;
		
	}
	
	
	@SuppressWarnings({ "unchecked", "deprecation", "rawtypes" })
	public static Parameters AmendAppointmentParameters(){
		
		final Parameters amendapptparam = new Parameters();
		
		//PUT /Appointment/[id]/$amend
		ParametersParameterComponent ppc = new ParametersParameterComponent();
		ppc.setName("reason");
		ppc.setValue(new StringType("Stomach upset"));
		
	/*	PUT /Appointment/[id]/$amend
	{
		"resourceType": "Parameters",
		"parameter": [{
			{
			"name": "reason",
			"valueString": "Stomach upset"
		}]
	}

*/

		return amendapptparam;
}

	
}
