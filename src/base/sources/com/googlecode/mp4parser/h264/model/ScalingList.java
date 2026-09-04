package com.googlecode.mp4parser.h264.model;

import com.googlecode.mp4parser.h264.read.CAVLCReader;
import com.googlecode.mp4parser.h264.write.CAVLCWriter;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class ScalingList {
    public int[] scalingList;
    public boolean useDefaultScalingMatrixFlag;

    public static ScalingList read(CAVLCReader cAVLCReader, int i10) {
        ScalingList scalingList = new ScalingList();
        scalingList.scalingList = new int[i10];
        int se2 = 8;
        int i11 = 8;
        int i12 = 0;
        while (i12 < i10) {
            if (se2 != 0) {
                se2 = ((cAVLCReader.readSE("deltaScale") + i11) + 256) % 256;
                scalingList.useDefaultScalingMatrixFlag = i12 == 0 && se2 == 0;
            }
            int[] iArr = scalingList.scalingList;
            if (se2 != 0) {
                i11 = se2;
            }
            iArr[i12] = i11;
            i12++;
        }
        return scalingList;
    }

    public String toString() {
        return "ScalingList{scalingList=" + this.scalingList + ", useDefaultScalingMatrixFlag=" + this.useDefaultScalingMatrixFlag + '}';
    }

    public void write(CAVLCWriter cAVLCWriter) throws IOException {
        int i10 = 0;
        if (this.useDefaultScalingMatrixFlag) {
            cAVLCWriter.writeSE(0, "SPS: ");
            return;
        }
        int i11 = 8;
        while (true) {
            int[] iArr = this.scalingList;
            if (i10 >= iArr.length) {
                return;
            }
            cAVLCWriter.writeSE((iArr[i10] - i11) - 256, "SPS: ");
            i11 = this.scalingList[i10];
            i10++;
        }
    }
}
