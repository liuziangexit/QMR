package com.game.guild.message;

import com.game.message.Message;

import org.apache.mina.core.buffer.IoBuffer;

/** 
 * @author Commuication Auto Maker
 * 
 * @version 1.0.0
 * 
 * 获取成员列表消息
 */
public class ReqGuildGetMemberListToServerMessage extends Message{

	//帮会Id
	private long guildId;
	
	
	/**
	 * 写入字节缓存
	 */
	public boolean write(IoBuffer buf){
		//帮会Id
		writeLong(buf, this.guildId);
		return true;
	}
	
	/**
	 * 读取字节缓存
	 */
	public boolean read(IoBuffer buf){
		//帮会Id
		this.guildId = readLong(buf);
		return true;
	}
	
	/**
	 * get 帮会Id
	 * @return 
	 */
	public long getGuildId(){
		return guildId;
	}
	
	/**
	 * set 帮会Id
	 */
	public void setGuildId(long guildId){
		this.guildId = guildId;
	}
	
	
	@Override
	public int getId() {
		return 121206;
	}

	@Override
	public String getQueue() {
		return null;
	}
	
	@Override
	public String getServer() {
		return null;
	}
	
	@Override
	public String toString(){
		StringBuffer buf = new StringBuffer("[");
		//帮会Id
		buf.append("guildId:" + guildId +",");
		if(buf.charAt(buf.length()-1)==',') buf.deleteCharAt(buf.length()-1);
		buf.append("]");
		return buf.toString();
	}
}