package com.googlecode.mp4parser.util;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class Matrix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    double f22497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    double f22498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    double f22499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    double f22500d;
    double tx;
    double ty;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    double f22501u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    double f22502v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    double f22503w;
    public static final Matrix ROTATE_0 = new Matrix(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final Matrix ROTATE_90 = new Matrix(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final Matrix ROTATE_180 = new Matrix(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final Matrix ROTATE_270 = new Matrix(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    public Matrix(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        this.f22501u = d14;
        this.f22502v = d15;
        this.f22503w = d16;
        this.f22497a = d10;
        this.f22498b = d11;
        this.f22499c = d12;
        this.f22500d = d13;
        this.tx = d17;
        this.ty = d18;
    }

    public static Matrix fromByteBuffer(ByteBuffer byteBuffer) {
        return fromFileOrder(IsoTypeReader.readFixedPoint1616(byteBuffer), IsoTypeReader.readFixedPoint1616(byteBuffer), IsoTypeReader.readFixedPoint0230(byteBuffer), IsoTypeReader.readFixedPoint1616(byteBuffer), IsoTypeReader.readFixedPoint1616(byteBuffer), IsoTypeReader.readFixedPoint0230(byteBuffer), IsoTypeReader.readFixedPoint1616(byteBuffer), IsoTypeReader.readFixedPoint1616(byteBuffer), IsoTypeReader.readFixedPoint0230(byteBuffer));
    }

    public static Matrix fromFileOrder(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        return new Matrix(d10, d11, d13, d14, d12, d15, d18, d16, d17);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Matrix matrix = (Matrix) obj;
        return Double.compare(matrix.f22497a, this.f22497a) == 0 && Double.compare(matrix.f22498b, this.f22498b) == 0 && Double.compare(matrix.f22499c, this.f22499c) == 0 && Double.compare(matrix.f22500d, this.f22500d) == 0 && Double.compare(matrix.tx, this.tx) == 0 && Double.compare(matrix.ty, this.ty) == 0 && Double.compare(matrix.f22501u, this.f22501u) == 0 && Double.compare(matrix.f22502v, this.f22502v) == 0 && Double.compare(matrix.f22503w, this.f22503w) == 0;
    }

    public void getContent(ByteBuffer byteBuffer) {
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.f22497a);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.f22498b);
        IsoTypeWriter.writeFixedPoint0230(byteBuffer, this.f22501u);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.f22499c);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.f22500d);
        IsoTypeWriter.writeFixedPoint0230(byteBuffer, this.f22502v);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.tx);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.ty);
        IsoTypeWriter.writeFixedPoint0230(byteBuffer, this.f22503w);
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f22501u);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f22502v);
        int i10 = (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f22503w);
        int i11 = (i10 * 31) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f22497a);
        int i12 = (i11 * 31) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)));
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f22498b);
        int i13 = (i12 * 31) + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)));
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f22499c);
        int i14 = (i13 * 31) + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)));
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f22500d);
        int i15 = (i14 * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)));
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.tx);
        int i16 = (i15 * 31) + ((int) (jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32)));
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.ty);
        return (i16 * 31) + ((int) ((jDoubleToLongBits9 >>> 32) ^ jDoubleToLongBits9));
    }

    public String toString() {
        if (equals(ROTATE_0)) {
            return "Rotate 0°";
        }
        if (equals(ROTATE_90)) {
            return "Rotate 90°";
        }
        if (equals(ROTATE_180)) {
            return "Rotate 180°";
        }
        if (equals(ROTATE_270)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f22501u + ", v=" + this.f22502v + ", w=" + this.f22503w + ", a=" + this.f22497a + ", b=" + this.f22498b + ", c=" + this.f22499c + ", d=" + this.f22500d + ", tx=" + this.tx + ", ty=" + this.ty + '}';
    }
}
