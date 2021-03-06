package com.getmission.model;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

public class GetMissionService {

	private GetMissionDAO_interface dao;

	public GetMissionService() {
		dao = new GetMissionDAO();
	}

	public GetMissionVO addMission(
			
			String mission_Category,
			String mission_Name,
			String mission_Des,
			String issuer_Mem_No,
			String takecase_Mem_No,
			Date mission_Release_Time,
			Date mission_Due_Time,
			Date mission_Start_Time,
			Date mission_End_Time,
			Integer mission_State,
			Integer mission_Pattern,
			Double mission_Pay,
			Double mission_Gps_Lat,
			Double mission_Gps_Lng) {

		GetMissionVO getMissionVO = new GetMissionVO();

		
		getMissionVO.setMission_Category(mission_Category);
		getMissionVO.setMission_Name(mission_Name);
		getMissionVO.setMission_Des(mission_Des);
		getMissionVO.setIssuer_Mem_No(issuer_Mem_No);
		getMissionVO.setTakecase_Mem_No(takecase_Mem_No);
		getMissionVO.setMission_Release_Time(mission_Release_Time);
		getMissionVO.setMission_Due_Time(mission_Due_Time);
		getMissionVO.setMission_Start_Time(mission_Start_Time);
		getMissionVO.setMission_End_Time(mission_End_Time);
		getMissionVO.setMission_State(mission_State);
		getMissionVO.setMission_Pattern(mission_Pattern);
		getMissionVO.setMission_Pay(mission_Pay);
		getMissionVO.setMission_Gps_Lat(mission_Gps_Lat);
		getMissionVO.setMission_Gps_Lng(mission_Gps_Lng);
		
		dao.insert(getMissionVO);

		return getMissionVO;
	}

	public GetMissionVO updateMission(
			String mission_No,
			String mission_Category,
			String mission_Name,
			String mission_Des,
			String issuer_Mem_No,
			String takecase_Mem_No,
			Date mission_Release_Time,
			Date mission_Due_Time,
			Date mission_Start_Time,
			Date mission_End_Time,
			Integer mission_State,
			Integer mission_Pattern,
			Double mission_Pay,
			Double mission_Gps_Lat,
			Double mission_Gps_Lng) {

		GetMissionVO getMissionVO = new GetMissionVO();

		getMissionVO.setMission_No(mission_No);
		getMissionVO.setMission_Category(mission_Category);
		getMissionVO.setMission_Name(mission_Name);
		getMissionVO.setMission_Des(mission_Des);
		getMissionVO.setIssuer_Mem_No(issuer_Mem_No);
		getMissionVO.setTakecase_Mem_No(takecase_Mem_No);
		getMissionVO.setMission_Release_Time(mission_Release_Time);
		getMissionVO.setMission_Due_Time(mission_Due_Time);
		getMissionVO.setMission_Start_Time(mission_Start_Time);
		getMissionVO.setMission_End_Time(mission_End_Time);
		getMissionVO.setMission_State(mission_State);
		getMissionVO.setMission_Pattern(mission_Pattern);
		getMissionVO.setMission_Pay(mission_Pay);
		getMissionVO.setMission_Gps_Lat(mission_Gps_Lat);
		getMissionVO.setMission_Gps_Lng(mission_Gps_Lng);
		dao.update(getMissionVO);

		return getMissionVO;
	}

	public void deleteMission(String mission_No) {
		dao.delete(mission_No);
	}

	public GetMissionVO getOneMission(String mission_No) {
		return dao.findByPrimaryKey(mission_No);
	}

	public List<GetMissionVO> getAll() {
		return dao.getAll();
	}
	
	public GetMissionVO takeMission(
		String mission_No,
		Integer mission_State) {

	GetMissionVO getMissionVO = new GetMissionVO();
	getMissionVO.setMission_No(mission_No);
	getMissionVO.setMission_State(mission_State);
	dao.update(getMissionVO);
		
		return getMissionVO;
	}
}
