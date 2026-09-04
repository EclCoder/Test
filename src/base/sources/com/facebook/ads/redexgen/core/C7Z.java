package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7Z, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7Z {
    public static final C2606no A0E = new C2606no(new Object());
    public final int A00;
    public final long A01;
    public final long A02;
    public final Timeline A03;
    public final C2606no A04;
    public final C2606no A05;
    public final C2588nW A06;
    public final C1248Ex A07;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "Start Stall Logging")
    public final EnumC2324ir A08;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "Determine if stall is from Audio for logging")
    public final boolean A09;
    public final boolean A0A;
    public volatile long A0B;
    public volatile long A0C;
    public volatile long A0D;

    public C7Z(Timeline timeline, long j10, C2588nW c2588nW, C1248Ex c1248Ex) {
        this(timeline, A0E, j10, C.TIME_UNSET, 1, false, c2588nW, c1248Ex, A0E, j10, j10, j10, EnumC2324ir.A09, false);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Customized to call base constructor")
    public C7Z(Timeline timeline, C2606no c2606no, long j10, long j11, int i10, boolean z10, C2588nW c2588nW, C1248Ex c1248Ex, C2606no c2606no2, long j12, long j13, long j14) {
        this(timeline, c2606no, j10, j11, i10, z10, c2588nW, c1248Ex, c2606no2, j12, j13, j14, EnumC2324ir.A09, false);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Customized to add new parameters")
    public C7Z(@MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) Timeline timeline, @MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) C2606no c2606no, long j10, long j11, int i10, boolean z10, C2588nW c2588nW, C1248Ex c1248Ex, C2606no c2606no2, long j12, long j13, long j14, EnumC2324ir enumC2324ir, boolean z11) {
        this.A03 = timeline;
        this.A05 = c2606no;
        this.A02 = j10;
        this.A01 = j11;
        this.A0C = j10;
        this.A00 = i10;
        this.A0A = z10;
        this.A06 = c2588nW;
        this.A07 = c1248Ex;
        this.A04 = c2606no2;
        this.A0B = j12;
        this.A0D = j13;
        this.A0C = j14;
        this.A08 = enumC2324ir;
        this.A09 = z11;
    }

    public static void A00(C7Z c7z, C7Z c7z2) {
        c7z2.A0C = c7z.A0C;
        c7z2.A0B = c7z.A0B;
        c7z2.A0D = c7z.A0D;
    }

    public final C7Z A01(int i10) {
        C7Z c7z = new C7Z(this.A03, this.A05, this.A02, this.A01, i10, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c7z);
        return c7z;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Stall Reason Logging in Hero")
    public final C7Z A02(int i10, EnumC2324ir enumC2324ir, boolean z10) {
        C7Z c7z = new C7Z(this.A03, this.A05, this.A02, this.A01, i10, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, enumC2324ir, z10);
        A00(this, c7z);
        return c7z;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "To track Audio Stalls for Logging")
    public final C7Z A03(int i10, boolean z10) {
        C7Z c7z = new C7Z(this.A03, this.A05, this.A02, this.A01, i10, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, z10);
        A00(this, c7z);
        return c7z;
    }

    public final C7Z A04(Timeline timeline) {
        C7Z c7z = new C7Z(timeline, this.A05, this.A02, this.A01, this.A00, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c7z);
        return c7z;
    }

    public final C7Z A05(C2606no c2606no) {
        return new C7Z(this.A03, this.A05, this.A02, this.A01, this.A00, this.A0A, this.A06, this.A07, c2606no, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
    }

    public final C7Z A06(C2606no c2606no, long j10, long j11, long j12) {
        long j13 = j11;
        Timeline timeline = this.A03;
        if (!c2606no.A00()) {
            j13 = C.TIME_UNSET;
        }
        return new C7Z(timeline, c2606no, j10, j13, this.A00, this.A0A, this.A06, this.A07, this.A04, this.A0B, j12, j10);
    }

    public final C7Z A07(C2588nW c2588nW, C1248Ex c1248Ex) {
        C7Z c7z = new C7Z(this.A03, this.A05, this.A02, this.A01, this.A00, this.A0A, c2588nW, c1248Ex, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c7z);
        return c7z;
    }

    public final C7Z A08(boolean z10) {
        C7Z c7z = new C7Z(this.A03, this.A05, this.A02, this.A01, this.A00, z10, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c7z);
        return c7z;
    }
}
