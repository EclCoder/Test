package com.theartofdev.edmodo.cropper;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();
    public int A;
    public int B;
    public int C;
    public CharSequence D;
    public int E;
    public Uri F;
    public Bitmap.CompressFormat G;
    public int H;
    public int I;
    public int J;
    public CropImageView.j K;
    public boolean L;
    public Rect M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public boolean S;
    public boolean T;
    public CharSequence U;
    public int V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CropImageView.c f35730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f35731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f35732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CropImageView.d f35733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CropImageView.k f35734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f35735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f35736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f35737h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f35738i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f35739j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f35740k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f35741l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f35742m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35743n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f35744o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35745p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f35746q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f35747r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f35748s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f35749t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f35750u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f35751v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f35752w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f35753x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f35754y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f35755z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public f() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        this.f35730a = CropImageView.c.RECTANGLE;
        this.f35731b = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f35732c = TypedValue.applyDimension(1, 24.0f, displayMetrics);
        this.f35733d = CropImageView.d.ON_TOUCH;
        this.f35734e = CropImageView.k.FIT_CENTER;
        this.f35735f = true;
        this.f35736g = true;
        this.f35737h = true;
        this.f35738i = false;
        this.f35739j = 4;
        this.f35740k = 0.1f;
        this.f35741l = false;
        this.f35742m = 1;
        this.f35743n = 1;
        this.f35744o = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f35745p = Color.argb(170, 255, 255, 255);
        this.f35746q = TypedValue.applyDimension(1, 2.0f, displayMetrics);
        this.f35747r = TypedValue.applyDimension(1, 5.0f, displayMetrics);
        this.f35748s = TypedValue.applyDimension(1, 14.0f, displayMetrics);
        this.f35749t = -1;
        this.f35750u = TypedValue.applyDimension(1, 1.0f, displayMetrics);
        this.f35751v = Color.argb(170, 255, 255, 255);
        this.f35752w = Color.argb(Sdk$SDKError.b.JSON_ENCODE_ERROR_VALUE, 0, 0, 0);
        this.f35753x = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.f35754y = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.f35755z = 40;
        this.A = 40;
        this.B = 99999;
        this.C = 99999;
        this.D = "";
        this.E = 0;
        this.F = Uri.EMPTY;
        this.G = Bitmap.CompressFormat.JPEG;
        this.H = 90;
        this.I = 0;
        this.J = 0;
        this.K = CropImageView.j.NONE;
        this.L = false;
        this.M = null;
        this.N = -1;
        this.O = true;
        this.P = true;
        this.Q = false;
        this.R = 90;
        this.S = false;
        this.T = false;
        this.U = null;
        this.V = 0;
    }

    public void a() {
        if (this.f35739j < 0) {
            throw new IllegalArgumentException("Cannot set max zoom to a number < 1");
        }
        if (this.f35732c < 0.0f) {
            throw new IllegalArgumentException("Cannot set touch radius value to a number <= 0 ");
        }
        float f10 = this.f35740k;
        if (f10 < 0.0f || f10 >= 0.5d) {
            throw new IllegalArgumentException("Cannot set initial crop window padding value to a number < 0 or >= 0.5");
        }
        if (this.f35742m <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.f35743n <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.f35744o < 0.0f) {
            throw new IllegalArgumentException("Cannot set line thickness value to a number less than 0.");
        }
        if (this.f35746q < 0.0f) {
            throw new IllegalArgumentException("Cannot set corner thickness value to a number less than 0.");
        }
        if (this.f35750u < 0.0f) {
            throw new IllegalArgumentException("Cannot set guidelines thickness value to a number less than 0.");
        }
        if (this.f35754y < 0) {
            throw new IllegalArgumentException("Cannot set min crop window height value to a number < 0 ");
        }
        int i10 = this.f35755z;
        if (i10 < 0) {
            throw new IllegalArgumentException("Cannot set min crop result width value to a number < 0 ");
        }
        int i11 = this.A;
        if (i11 < 0) {
            throw new IllegalArgumentException("Cannot set min crop result height value to a number < 0 ");
        }
        if (this.B < i10) {
            throw new IllegalArgumentException("Cannot set max crop result width to smaller value than min crop result width");
        }
        if (this.C < i11) {
            throw new IllegalArgumentException("Cannot set max crop result height to smaller value than min crop result height");
        }
        if (this.I < 0) {
            throw new IllegalArgumentException("Cannot set request width value to a number < 0 ");
        }
        if (this.J < 0) {
            throw new IllegalArgumentException("Cannot set request height value to a number < 0 ");
        }
        int i12 = this.R;
        if (i12 < 0 || i12 > 360) {
            throw new IllegalArgumentException("Cannot set rotation degrees value to a number < 0 or > 360");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f35730a.ordinal());
        parcel.writeFloat(this.f35731b);
        parcel.writeFloat(this.f35732c);
        parcel.writeInt(this.f35733d.ordinal());
        parcel.writeInt(this.f35734e.ordinal());
        parcel.writeByte(this.f35735f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f35736g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f35737h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f35738i ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f35739j);
        parcel.writeFloat(this.f35740k);
        parcel.writeByte(this.f35741l ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f35742m);
        parcel.writeInt(this.f35743n);
        parcel.writeFloat(this.f35744o);
        parcel.writeInt(this.f35745p);
        parcel.writeFloat(this.f35746q);
        parcel.writeFloat(this.f35747r);
        parcel.writeFloat(this.f35748s);
        parcel.writeInt(this.f35749t);
        parcel.writeFloat(this.f35750u);
        parcel.writeInt(this.f35751v);
        parcel.writeInt(this.f35752w);
        parcel.writeInt(this.f35753x);
        parcel.writeInt(this.f35754y);
        parcel.writeInt(this.f35755z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        TextUtils.writeToParcel(this.D, parcel, i10);
        parcel.writeInt(this.E);
        parcel.writeParcelable(this.F, i10);
        parcel.writeString(this.G.name());
        parcel.writeInt(this.H);
        parcel.writeInt(this.I);
        parcel.writeInt(this.J);
        parcel.writeInt(this.K.ordinal());
        parcel.writeInt(this.L ? 1 : 0);
        parcel.writeParcelable(this.M, i10);
        parcel.writeInt(this.N);
        parcel.writeByte(this.O ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.P ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.Q ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.R);
        parcel.writeByte(this.S ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.T ? (byte) 1 : (byte) 0);
        TextUtils.writeToParcel(this.U, parcel, i10);
        parcel.writeInt(this.V);
    }

    protected f(Parcel parcel) {
        this.f35730a = CropImageView.c.values()[parcel.readInt()];
        this.f35731b = parcel.readFloat();
        this.f35732c = parcel.readFloat();
        this.f35733d = CropImageView.d.values()[parcel.readInt()];
        this.f35734e = CropImageView.k.values()[parcel.readInt()];
        this.f35735f = parcel.readByte() != 0;
        this.f35736g = parcel.readByte() != 0;
        this.f35737h = parcel.readByte() != 0;
        this.f35738i = parcel.readByte() != 0;
        this.f35739j = parcel.readInt();
        this.f35740k = parcel.readFloat();
        this.f35741l = parcel.readByte() != 0;
        this.f35742m = parcel.readInt();
        this.f35743n = parcel.readInt();
        this.f35744o = parcel.readFloat();
        this.f35745p = parcel.readInt();
        this.f35746q = parcel.readFloat();
        this.f35747r = parcel.readFloat();
        this.f35748s = parcel.readFloat();
        this.f35749t = parcel.readInt();
        this.f35750u = parcel.readFloat();
        this.f35751v = parcel.readInt();
        this.f35752w = parcel.readInt();
        this.f35753x = parcel.readInt();
        this.f35754y = parcel.readInt();
        this.f35755z = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.D = (CharSequence) creator.createFromParcel(parcel);
        this.E = parcel.readInt();
        this.F = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.G = Bitmap.CompressFormat.valueOf(parcel.readString());
        this.H = parcel.readInt();
        this.I = parcel.readInt();
        this.J = parcel.readInt();
        this.K = CropImageView.j.values()[parcel.readInt()];
        this.L = parcel.readByte() != 0;
        this.M = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.N = parcel.readInt();
        this.O = parcel.readByte() != 0;
        this.P = parcel.readByte() != 0;
        this.Q = parcel.readByte() != 0;
        this.R = parcel.readInt();
        this.S = parcel.readByte() != 0;
        this.T = parcel.readByte() != 0;
        this.U = (CharSequence) creator.createFromParcel(parcel);
        this.V = parcel.readInt();
    }
}
