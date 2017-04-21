///* *********************************************************************** *
// * project: org.matsim.*
// * DigicoreVehicleWriterHandlerImpl_v0.java
// *                                                                         *
// * *********************************************************************** *
// *                                                                         *
// * copyright       : (C) 2013 by the members listed in the COPYING,        *
// *                   LICENSE and WARRANTY file.                            *
// * email           : info at matsim dot org                                *
// *                                                                         *
// * *********************************************************************** *
// *                                                                         *
// *   This program is free software; you can redistribute it and/or modify  *
// *   it under the terms of the GNU General Public License as published by  *
// *   the Free Software Foundation; either version 2 of the License, or     *
// *   (at your option) any later version.                                   *
// *   See also COPYING, LICENSE and WARRANTY file                           *
// *                                                                         *
// * *********************************************************************** */
//
//package playground.nmviljoen.io;
//
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.util.Calendar;
//import java.util.GregorianCalendar;
//
//import playground.southafrica.freight.digicore.containers.DigicoreActivity;
//import playground.southafrica.freight.digicore.containers.DigicorePosition;
//import playground.southafrica.freight.digicore.containers.DigicoreTrace;
//import playground.southafrica.freight.digicore.containers.DigicoreVehicle;
//import playground.southafrica.freight.digicore.containers.DigicoreVehicles;
//
//public class MultilayerInstanceWriterHandlerImpl_v1 implements
//		MultilayerInstanceWriterHandler {
//
//
////	@Override
////	public void startVehicles(DigicoreVehicles vehicles, BufferedWriter out) throws IOException {
////		out.write("\n<digicoreVehicles");
////		out.write(" crs=\"" + vehicles.getCoordinateReferenceSystem() + "\"");
////		if(vehicles.getDescription() != null){
////			out.write(" desc=\"" + vehicles.getDescription() + "\"");
////		}
////		out.write(">\n");
////	}
////
////	@Override
////	public void endVehicles(BufferedWriter out) throws IOException {
////		out.write("</digicoreVehicles>");
////	}
////
////
////	@Override
////	public void startVehicle(DigicoreVehicle vehicle, BufferedWriter out)
////			throws IOException {
////		out.write("\n\t<digicoreVehicle");
////		out.write(" id=\"" + vehicle.getId().toString() + "\"");
////		out.write(" type=\"" + vehicle.getType().getId().toString() + "\"");
////		out.write(" timezone=\"GMT+2\" locale=\"en\"");
////		out.write(">\n");
////	}
////
////	@Override
////	public void endVehicle(BufferedWriter out) throws IOException {
////		out.write("\t</digicoreVehicle>\n");
////	}
////
////	@Override
////	public void startChain(BufferedWriter out)
////			throws IOException {
////		out.write("\t\t<chain>\n");
////	}
////
////	@Override
////	public void endChain(BufferedWriter out) throws IOException {
////		out.write("\t\t</chain>\n");
////	}
////
////	@Override
////	public void startActivity(DigicoreActivity activity, BufferedWriter out)
////			throws IOException {
////		out.write("\t\t\t<activity");
////		out.write(" type=\"" + activity.getType() + "\"\n");
////		out.write("\t\t\t\tstart=\"" + getDateString(activity.getStartTimeGregorianCalendar()) + "\"");
////		out.write(" end=\"" + getDateString(activity.getEndTimeGregorianCalendar()) + "\"\n");
////		out.write("\t\t\t\tx=\"" + String.format("%.2f", activity.getCoord().getX()) + "\"");
////		out.write(" y=\"" + String.format("%.2f", activity.getCoord().getY()) + "\"");
////		if(activity.getFacilityId() != null){
////			out.write(" facility=\"" + activity.getFacilityId().toString() + "\"");
////		}
////		if(activity.getLinkId() != null){
////			out.write(" link=\"" + activity.getLinkId().toString() + "\"");
////		}
////	}
////
////	@Override
////	public void endActivity(BufferedWriter out) throws IOException {
////		out.write("/>\n");
////		
////	}
////
////	@Override
////	public void writeSeparator(BufferedWriter out) throws IOException {
////		/* Don't think a separator will make the file more readable. */
////	}
////	
////	private String getDateString(GregorianCalendar cal){
////		String s = "";
////		int year = cal.get(Calendar.YEAR);
////		int month = cal.get(Calendar.MONTH)+1; // Seems to be a java thing that month is started at 0... 
////		int day = cal.get(Calendar.DAY_OF_MONTH);
////		int hour = cal.get(Calendar.HOUR_OF_DAY);
////		int minute = cal.get(Calendar.MINUTE);
////		int second = cal.get(Calendar.SECOND);
////			
////		s = String.format("%04d%02d%02d %02d:%02d:%02d", 
////				year, month, day, hour, minute, second);
////		
////		return s;
////	}
////
////	@Override
////	public void startTrace(DigicoreTrace trace, BufferedWriter out) throws IOException {
////		/* Do nothing: implemented from v2 */
////	}
////
////	@Override
////	public void endTrace(BufferedWriter out) throws IOException {
////		/* Do nothing: implemented from v2 */
////	}
////
////	@Override
////	public void startPosition(DigicorePosition pos, BufferedWriter out) throws IOException {
////		/* Do nothing: implemented from v2 */
////	}
////
////	@Override
////	public void endPosition(BufferedWriter out) throws IOException {
////		/* Do nothing: implemented from v2 */
////	}
//
//	@Override
//	public void startSets(BufferedWriter out) throws IOException {
//		out.write("\n<sets");
//		out.write(" archetype=\"...\"");
//		out.write(" instance=\"...\">\n");
//	}
//
//	@Override
//	public void endSets(BufferedWriter out) throws IOException {
//		out.write("\n<sets>\n");
//	}
//
//	@Override
//	public void startSet(BufferedWriter out) throws IOException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void endSet(BufferedWriter out) throws IOException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void startPath(BufferedWriter out) throws IOException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void endPath(BufferedWriter out) throws IOException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void startNode(BufferedWriter out) throws IOException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void endNode(BufferedWriter out) throws IOException {
//		// TODO Auto-generated method stub
//		
//	}
//}
//