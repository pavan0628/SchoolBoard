package com.school.sba.entity;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Schedule {

	public LocalTime getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(LocalTime scheduleId) {
		this.scheduleId = scheduleId;
	}
	public LocalTime getOpensAt() {
		return opensAt;
	}
	public void setOpensAt(LocalTime opensAt) {
		this.opensAt = opensAt;
	}
	public LocalTime getCloseAt() {
		return closeAt;
	}
	public void setCloseAt(LocalTime closeAt) {
		this.closeAt = closeAt;
	}
	public int getClassHoursPerDay() {
		return classHoursPerDay;
	}
	public void setClassHoursPerDay(int classHoursPerDay) {
		this.classHoursPerDay = classHoursPerDay;
	}
	public LocalTime getClassHourLength() {
		return classHourLength;
	}
	public void setClassHourLength(LocalTime classHourLength) {
		this.classHourLength = classHourLength;
	}
	public LocalTime getBreakTime() {
		return breakTime;
	}
	public void setBreakTime(LocalTime breakTime) {
		this.breakTime = breakTime;
	}
	public LocalTime getBreakLength() {
		return breakLength;
	}
	public void setBreakLength(LocalTime breakLength) {
		this.breakLength = breakLength;
	}
	public LocalTime getLunchTime() {
		return lunchTime;
	}
	public void setLunchTime(LocalTime lunchTime) {
		this.lunchTime = lunchTime;
	}
	public LocalTime getLunchLength() {
		return lunchLength;
	}
	public void setLunchLength(LocalTime lunchLength) {
		this.lunchLength = lunchLength;
	}
	private LocalTime scheduleId;
	private LocalTime opensAt;
	private LocalTime closeAt;
	private int classHoursPerDay;
	private LocalTime classHourLength;
	private LocalTime breakTime;
	private LocalTime breakLength;
	private LocalTime lunchTime;
	private LocalTime lunchLength;
}
