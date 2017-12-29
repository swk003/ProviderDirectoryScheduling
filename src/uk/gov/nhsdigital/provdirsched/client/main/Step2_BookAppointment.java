package uk.gov.nhsdigital.provdirsched.client.main;

import java.util.ArrayList;
import java.util.List;

import org.hl7.fhir.dstu2016may.model.Appointment.AppointmentStatus;
import org.hl7.fhir.dstu2016may.model.Appointment.ParticipationStatus;
import org.hl7.fhir.dstu3.model.Appointment;
import org.hl7.fhir.dstu3.model.Appointment.AppointmentParticipantComponent;
import org.hl7.fhir.dstu3.model.Appointment.ParticipantRequired;
import org.hl7.fhir.dstu3.model.CodeType;
import org.hl7.fhir.dstu3.model.ContactPoint.ContactPointSystem;
import org.hl7.fhir.dstu3.model.DocumentReference.DocumentReferenceContentComponent;
import org.hl7.fhir.dstu3.model.Enumerations.DocumentReferenceStatus;
import org.hl7.fhir.dstu3.model.Parameters.ParametersParameterComponent;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Coding;
import org.hl7.fhir.dstu3.model.ContactPoint;
import org.hl7.fhir.dstu3.model.DateTimeType;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.Meta;
import org.hl7.fhir.dstu3.model.Parameters;
import org.hl7.fhir.dstu3.model.Period;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.StringType;
import org.hl7.fhir.dstu3.model.codesystems.Appointmentstatus;
import org.hl7.fhir.instance.model.api.IBaseCoding;



public class Step2_BookAppointment {

	@SuppressWarnings({ "unchecked", "deprecation", "rawtypes" })
	public static Appointment createAppointment(){
		
		final Appointment appt = new Appointment();
		
		appt.setId("13daadee-26e1-4d6a-9e6a-7f4af9b58877");
		
		Meta meta = new Meta();
		meta.addProfile("https://fhir.nhs.uk/StructureDefinition/GPConnect-Appointment-1");
		appt.setMeta(meta);
		
		// Not used in GP Connect example
		/*Identifier rr5 = new Identifier();
		rr5.setSystem(" http://www.acme.com/identifiers/patient").setValue("b18f24b7-e72c-44c0-bdf4-7e45d06db1b6");
		appt.addIdentifier(rr5);*/
		
		appt.setStatus(org.hl7.fhir.dstu3.model.Appointment.AppointmentStatus.PROPOSED);
		
		CodeableConcept appttype = (CodeableConcept) appt.getAppointmentType().addCoding(new Coding().setSystem("http://hl7.org/fhir/ValueSet/c80-practice-codes").setCode("408443003"));
		appttype.setText("GP");
		
		//REASON
		CodeableConcept reastype = (CodeableConcept) appt.getReasonFirstRep();
		reastype.setText("Free text reason.");
		appt.setDescription("Free text description.");
		appt.addSlot(new Reference().setReference("Slot/1").setDisplay("Slot 1"));
		appt.setComment("Free text description.");
		
		AppointmentParticipantComponent part1 = new AppointmentParticipantComponent();
		CodeableConcept part1type = (CodeableConcept) part1.getTypeFirstRep().addCoding(new Coding().setSystem("http://hl7.org/fhir/ValueSet/encounter-participant-type").setCode("SBJ"));
		part1type.setText("Subject");
		part1.setActor(new Reference().setReference("Patient/1").setDisplay("Mr. Mike Smith"));
		part1.setRequired(ParticipantRequired.REQUIRED);
		part1.setStatus(org.hl7.fhir.dstu3.model.Appointment.ParticipationStatus.ACCEPTED);
		appt.addParticipant(part1);
		
		appt.setStatus(org.hl7.fhir.dstu3.model.Appointment.AppointmentStatus.BOOKED);
		
		AppointmentParticipantComponent part2 = new AppointmentParticipantComponent();
		CodeableConcept part2type = (CodeableConcept) part2.getTypeFirstRep().addCoding(new Coding().setSystem("http://hl7.org/fhir/ValueSet/encounter-participant-type").setCode("PPRF"));
		part2type.setText("Primary Performer");
		part2.setActor(new Reference().setReference("Practitioner/100").setDisplay("Dr. Bob Smith"));
		part2.setRequired(ParticipantRequired.REQUIRED);
		part2.setStatus(org.hl7.fhir.dstu3.model.Appointment.ParticipationStatus.ACCEPTED);
		appt.addParticipant(part2);
		
		appt.addRequestedPeriod(new Period().setStartElement(new DateTimeType("2017-06-23T11:20:53+02:00")).setEndElement(new DateTimeType("2017-06-23T11:20:53+02:00")));

	   return appt;
		
	}
	
	
	@SuppressWarnings({ "unchecked", "deprecation", "rawtypes" })
	public static Parameters CreateSlotParameters(){
		
		final Parameters slotparam = new Parameters();
		
		//POST /Slot/[id]/$book
		ParametersParameterComponent ppc = new ParametersParameterComponent();
		ppc.setName("patient");
		ppc.setValue(new Reference().setReference("Patient/1").setDisplay("SMITH, Mike (Mr)"));
		slotparam.addParameter(ppc);
		
		ParametersParameterComponent ppc1 = new ParametersParameterComponent();
		ppc1.setName("reason");
		ppc1.setValue(new StringType("Feel unwell"));
		slotparam.addParameter(ppc1);
		
		
		
	
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

		return slotparam;
}

	
}