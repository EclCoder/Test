package qn;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import fl.g0;
import kotlin.jvm.internal.s;
import xn.f;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f50916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f50917c;

    public a(String sections, String ranges, String mappings) {
        s.h(sections, "sections");
        s.h(ranges, "ranges");
        s.h(mappings, "mappings");
        this.f50915a = sections;
        this.f50916b = ranges;
        this.f50917c = mappings;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    private final int a(int i10, int i11, int i12) {
        int i13;
        int i14 = i10 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        int i15 = i12 - 1;
        while (i11 <= i15) {
            i13 = (i11 + i15) / 2;
            int i16 = s.i(i14, this.f50916b.charAt(i13 * 4));
            if (i16 < 0) {
                i15 = i13 - 1;
            } else {
                if (i16 <= 0) {
                    return i13 >= 0 ? i13 * 4 : ((-i13) - 2) * 4;
                }
                i11 = i13 + 1;
            }
        }
        i13 = (-i11) - 1;
        if (i13 >= 0) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    private final int b(int i10) {
        int i11;
        int i12 = (i10 & 2097024) >> 7;
        int length = (this.f50915a.length() / 4) - 1;
        int i13 = 0;
        while (i13 <= length) {
            i11 = (i13 + length) / 2;
            int i14 = s.i(i12, c.a(this.f50915a, i11 * 4));
            if (i14 < 0) {
                length = i11 - 1;
            } else {
                if (i14 <= 0) {
                    return i11 >= 0 ? i11 * 4 : ((-i11) - 2) * 4;
                }
                i13 = i11 + 1;
            }
        }
        i11 = (-i13) - 1;
        if (i11 >= 0) {
        }
    }

    public final boolean c(int i10, f sink) {
        s.h(sink, "sink");
        int iB = b(i10);
        int iA = a(i10, c.a(this.f50915a, iB + 2), iB + 4 < this.f50915a.length() ? c.a(this.f50915a, iB + 6) : this.f50916b.length() / 4);
        char cCharAt = this.f50916b.charAt(iA + 1);
        if (cCharAt >= 0 && cCharAt < '@') {
            int iA2 = c.a(this.f50916b, iA + 2);
            sink.Q(this.f50917c, iA2, cCharAt + iA2);
            return true;
        }
        if ('@' <= cCharAt && cCharAt < 'P') {
            sink.D(i10 - (this.f50916b.charAt(iA + 3) | (((cCharAt & 15) << 14) | (this.f50916b.charAt(iA + 2) << 7))));
            return true;
        }
        if ('P' <= cCharAt && cCharAt < '`') {
            sink.D(i10 + (this.f50916b.charAt(iA + 3) | ((cCharAt & 15) << 14) | (this.f50916b.charAt(iA + 2) << 7)));
            return true;
        }
        if (cCharAt == 'w') {
            g0 g0Var = g0.f38750a;
            return true;
        }
        if (cCharAt == 'x') {
            sink.D(i10);
            return true;
        }
        if (cCharAt == 'y') {
            sink.D(i10);
            return false;
        }
        if (cCharAt == 'z') {
            sink.writeByte(this.f50916b.charAt(iA + 2));
            return true;
        }
        if (cCharAt == '{') {
            sink.writeByte(this.f50916b.charAt(iA + 2) | 128);
            return true;
        }
        if (cCharAt == '|') {
            sink.writeByte(this.f50916b.charAt(iA + 2));
            sink.writeByte(this.f50916b.charAt(iA + 3));
            return true;
        }
        if (cCharAt == '}') {
            sink.writeByte(this.f50916b.charAt(iA + 2) | 128);
            sink.writeByte(this.f50916b.charAt(iA + 3));
            return true;
        }
        if (cCharAt == '~') {
            sink.writeByte(this.f50916b.charAt(iA + 2));
            sink.writeByte(this.f50916b.charAt(iA + 3) | 128);
            return true;
        }
        if (cCharAt == 127) {
            sink.writeByte(this.f50916b.charAt(iA + 2) | 128);
            sink.writeByte(this.f50916b.charAt(iA + 3) | 128);
            return true;
        }
        throw new IllegalStateException(("unexpected rangesIndex for " + i10).toString());
    }
}
