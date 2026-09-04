package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8A, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C8A {
    public static String[] A06 = {"jkVScMAnmSDw5NjtFKaMDw93YHVTZfVV", "X8vR6FaiUrrVUV4OyPqbjTz4nTbdT", "DJqg7VUdCo9q2ysxPrWS1RTdTLsj", "4FrbkvGGO58oIWN02YSUZA4iQkwc41Il", "lEgbsVLzgPUjgc1", "ISDPu1y88m9uUW9z", "L6djBwtYOA2bka2PQ69EdZLSIG4ne", "x8MPEelqUvAzBLNZGFUUNdgpeh0HUacA"};
    public C2606no A00;
    public C2606no A01;
    public C2606no A02;
    public BP<C2606no> A03 = BP.A03();
    public AbstractC2650oX<C2606no, Timeline> A04 = AbstractC2650oX.A04();
    public final C2725pl A05;

    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2606no A00(InterfaceC09613b interfaceC09613b, BP<C2606no> bp2, C2606no c2606no, C2725pl c2725pl) {
        int iA07;
        Object obj;
        int i10;
        Timeline timelineA7g = interfaceC09613b.A7g();
        int iA7c = interfaceC09613b.A7c();
        Object objA0M = timelineA7g.A0N() ? null : timelineA7g.A0M(iA7c);
        if (interfaceC09613b.AAd()) {
            iA07 = -1;
        } else {
            boolean zA0N = timelineA7g.A0N();
            String[] strArr = A06;
            if (strArr[7].charAt(14) != strArr[3].charAt(14)) {
                throw new RuntimeException();
            }
            A06[6] = "fPIpfte6042F2VeKOBsTFTkNJVxhR";
            if (zA0N) {
                iA07 = -1;
            } else {
                iA07 = timelineA7g.A0H(iA7c, c2725pl).A07(C5C.A0O(interfaceC09613b.A7e()) - c2725pl.A0C());
            }
        }
        for (int i11 = 0; i11 < bp2.size(); i11++) {
            C2606no c2606no2 = bp2.get(i11);
            if (A04(c2606no2, objA0M, interfaceC09613b.AAd(), interfaceC09613b.A7Y(), interfaceC09613b.A7Z(), iA07)) {
                return c2606no2;
            }
        }
        if (bp2.isEmpty() && c2606no != null && A04(c2606no, obj, interfaceC09613b.AAd(), interfaceC09613b.A7Y(), interfaceC09613b.A7Z(), i10)) {
            obj = objA0M;
            i10 = iA07;
            return c2606no;
        }
        obj = objA0M;
        i10 = iA07;
        return null;
    }

    public C8A(C2725pl c2725pl) {
        this.A05 = c2725pl;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oV != com.google.common.collect.ImmutableMap$Builder<com.facebook.ads.androidx.media3.exoplayer.source.MediaSource$MediaPeriodId, com.facebook.ads.androidx.media3.common.Timeline> */
    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "builder of ImmutableMap should be a buildOrThrow")
    private void A02(Timeline timeline) {
        C2648oV<C2606no, Timeline> c2648oVA03 = AbstractC2650oX.A03();
        if (this.A03.isEmpty()) {
            A03(c2648oVA03, this.A01, timeline);
            C2606no c2606no = this.A02;
            C2606no c2606no2 = this.A01;
            if (A06[4].length() == 25) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[2] = "UxUdIKnoAyUMpq9t4QIr4fpxRPT3";
            strArr[1] = "6BCX8szW2uTmGViuSf00Yq1AObOIr";
            if (!CB.A01(c2606no, c2606no2)) {
                A03(c2648oVA03, this.A02, timeline);
            }
            if (!CB.A01(this.A00, this.A01) && !CB.A01(this.A00, this.A02)) {
                A03(c2648oVA03, this.A00, timeline);
            }
        } else {
            for (int i10 = 0; i10 < this.A03.size(); i10++) {
                A03(c2648oVA03, this.A03.get(i10), timeline);
            }
            if (!this.A03.contains(this.A00)) {
                A03(c2648oVA03, this.A00, timeline);
            }
        }
        this.A04 = c2648oVA03.A07();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oV != com.google.common.collect.ImmutableMap$Builder<com.facebook.ads.androidx.media3.exoplayer.source.MediaSource$MediaPeriodId, com.facebook.ads.androidx.media3.common.Timeline> */
    private void A03(C2648oV<C2606no, Timeline> c2648oV, C2606no c2606no, Timeline timeline) {
        if (c2606no == null) {
            return;
        }
        if (timeline.A0A(c2606no.A04) != -1) {
            c2648oV.A05(c2606no, timeline);
            return;
        }
        Timeline existingTimeline = this.A04.get(c2606no);
        if (existingTimeline == null) {
            return;
        }
        c2648oV.A05(c2606no, existingTimeline);
    }

    public static boolean A04(C2606no c2606no, Object obj, boolean z10, int i10, int i11, int i12) {
        if (c2606no.A04.equals(obj)) {
            return (z10 && c2606no.A00 == i10 && c2606no.A01 == i11) || (!z10 && c2606no.A00 == -1 && c2606no.A02 == i12);
        }
        return false;
    }

    public final Timeline A05(C2606no c2606no) {
        return this.A04.get(c2606no);
    }

    public final C2606no A06() {
        return this.A00;
    }

    public final void A07(InterfaceC09613b interfaceC09613b) {
        this.A00 = A00(interfaceC09613b, this.A03, this.A01, this.A05);
        A02(interfaceC09613b.A7g());
    }
}
