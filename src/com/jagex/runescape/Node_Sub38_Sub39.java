package com.jagex.runescape;

public class Node_Sub38_Sub39 extends Node_Sub38
{
	static int anInt10494;
	private int anInt10495 = 1;
	private int anInt10496 = 204;
	static int anInt10497;
	private int anInt10498 = 1;
	static Class192 aClass192_10499 = new Class192(122, 10);
	static Class302 aClass302_10500;
	
	final void method2780(boolean bool, Buffer buffer, int i) {
		int i_0_ = i;
	while_269_:
		do {
			do {
				if (i_0_ != 0) {
					if (i_0_ != 1) {
						if (i_0_ == 2) {
							break;
						}
						break while_269_;
					}
				} else {
					anInt10498 = buffer.readUnsignedByte();
					break while_269_;
				}
				anInt10495 = buffer.readUnsignedByte();
				break while_269_;
			} while (false);
			anInt10496 = buffer.readUnsignedShort();
		} while (false);
		anInt10494++;
		if (bool != false) {
			method2917(-119);
		}
	}
	
	public static void method2917(int i) {
		aClass192_10499 = null;
		aClass302_10500 = null;
		if (i != 0) {
			method2917(-110);
		}
	}
	
	public Node_Sub38_Sub39() {
		super(0, true);
	}
	
	final int[] method2775(int i, int i_1_) {
		anInt10497++;
		int[] is = aClass146_7460.method1645(27356, i_1_);
		if (aClass146_7460.aBoolean1819) {
			int i_2_ = 0;
			for (; Class339_Sub7.anInt8728 > i_2_; i_2_++) {
				int i_3_ = CacheNode_Sub3.anIntArray9442[i_2_];
				int i_4_ = Node_Sub25_Sub1.anIntArray9941[i_1_];
				int i_5_ = i_3_ * anInt10498 >> 12;
				int i_6_ = i_4_ * anInt10495 >> 12;
				int i_7_ = i_3_ % (4096 / anInt10498) * anInt10498;
				int i_8_ = anInt10495 * (i_4_ % (4096 / anInt10495));
				if (anInt10496 > i_8_) {
					for (i_5_ -= i_6_; i_5_ < 0; i_5_ += 4) {

					}
					for (; i_5_ > 3; i_5_ -= 4) {

					}
					if (i_5_ != 1) {
						is[i_2_] = 0;
						continue;
					}
					if (i_7_ < anInt10496) {
						is[i_2_] = 0;
						continue;
					}
				}
				if (anInt10496 > i_7_) {
					for (i_5_ -= i_6_; i_5_ < 0; i_5_ += 4) {

					}
					for (; i_5_ > 3; i_5_ -= 4) {

					}
					if (i_5_ > 0) {
						is[i_2_] = 0;
						continue;
					}
				}
				is[i_2_] = 4096;
			}
		}
		if (i <= 107) {
			method2917(-36);
		}
		return is;
	}
}