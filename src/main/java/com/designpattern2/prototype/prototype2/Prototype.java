package com.designpattern2.prototype.prototype2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//��ģʽ��˼����ǽ�һ��������Ϊԭ�ͣ�������и��ơ���¡������һ����ԭ�������Ƶ��¶���
//ԭ�������ʵ��Cloneable�ӿ�ʵ��clone����
//ǳ���ƣ���һ�������ƺ󣬻����������͵ı����������´��������������ͣ�ָ��Ļ���ԭ������ָ��ġ�
//��ƣ���һ�������ƺ󣬲����ǻ����������ͻ����������ͣ��������´����ġ�����˵��������ƽ�������ȫ���׵ĸ��ƣ���ǳ���Ʋ����ס�
public class Prototype implements Cloneable, Serializable {
	private static final long serialVersionUID = 1L;
	private String string;
	private SerializableObject obj;

	/* ǳ���� */
	public Object clone() throws CloneNotSupportedException {
		Prototype proto = (Prototype) super.clone();
		return proto;
	}

	/* ��� */
	public Object deepClone() throws IOException, ClassNotFoundException {

		/* д�뵱ǰ����Ķ������� */
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		/* �������������������¶��� */
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public SerializableObject getObj() {
		return obj;
	}

	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}

   }

