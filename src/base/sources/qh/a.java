package qh;

import android.net.Uri;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f50789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f50790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f50791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f50792h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f50793i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f50794j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f50795k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f50796l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f50797m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f50798n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f50799o;

    public /* synthetic */ a(String str, Uri uri, String str2, String str3, long j10, long j11, long j12, long j13, long j14, float f10, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? UUID.randomUUID().toString() : str, uri, str2, str3, j10, (i10 & 32) != 0 ? 0L : j11, j12, (i10 & 128) != 0 ? j12 : j13, (i10 & 256) != 0 ? j12 : j14, (i10 & 512) != 0 ? 1.0f : f10, (i10 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? false : z10);
    }

    @Override // qh.k
    public long b() {
        return this.f50797m;
    }

    @Override // qh.k
    public long c() {
        return this.f50793i;
    }

    @Override // qh.k
    public String d() {
        return this.f50792h;
    }

    @Override // qh.k
    public void e(long j10) {
        this.f50797m = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.c(this.f50789e, aVar.f50789e) && s.c(this.f50790f, aVar.f50790f) && s.c(this.f50791g, aVar.f50791g) && s.c(this.f50792h, aVar.f50792h) && this.f50793i == aVar.f50793i && this.f50794j == aVar.f50794j && this.f50795k == aVar.f50795k && this.f50796l == aVar.f50796l && this.f50797m == aVar.f50797m && Float.compare(this.f50798n, aVar.f50798n) == 0 && this.f50799o == aVar.f50799o;
    }

    @Override // qh.k
    public void f(long j10) {
        this.f50793i = j10;
    }

    public final boolean g() {
        return this.f50799o;
    }

    @Override // qh.k
    public String getId() {
        return this.f50789e;
    }

    public final long h() {
        return this.f50795k;
    }

    public int hashCode() {
        return (((((((((((((((((((this.f50789e.hashCode() * 31) + this.f50790f.hashCode()) * 31) + this.f50791g.hashCode()) * 31) + this.f50792h.hashCode()) * 31) + Long.hashCode(this.f50793i)) * 31) + Long.hashCode(this.f50794j)) * 31) + Long.hashCode(this.f50795k)) * 31) + Long.hashCode(this.f50796l)) * 31) + Long.hashCode(this.f50797m)) * 31) + Float.hashCode(this.f50798n)) * 31) + Boolean.hashCode(this.f50799o);
    }

    public final String i() {
        return this.f50791g;
    }

    public final long j() {
        return this.f50796l;
    }

    public final long k() {
        return this.f50794j;
    }

    public final Uri l() {
        return this.f50790f;
    }

    public final float m() {
        return this.f50798n;
    }

    public final void n(boolean z10) {
        this.f50799o = z10;
    }

    public final void o(long j10) {
        this.f50796l = j10;
    }

    public final void p(long j10) {
        this.f50794j = j10;
    }

    public final void q(float f10) {
        this.f50798n = f10;
    }

    public String toString() {
        return "AudioTimelineItem(id=" + this.f50789e + ", uri=" + this.f50790f + ", path=" + this.f50791g + ", text=" + this.f50792h + ", startPosInPlaylist=" + this.f50793i + ", trimStartTime=" + this.f50794j + ", originalDuration=" + this.f50795k + ", trimEndTime=" + this.f50796l + ", durationInPlaylist=" + this.f50797m + ", volume=" + this.f50798n + ", loop=" + this.f50799o + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String id2, Uri uri, String path, String text, long j10, long j11, long j12, long j13, long j14, float f10, boolean z10) {
        super(id2, text, j10, j14);
        s.h(id2, "id");
        s.h(uri, "uri");
        s.h(path, "path");
        s.h(text, "text");
        this.f50789e = id2;
        this.f50790f = uri;
        this.f50791g = path;
        this.f50792h = text;
        this.f50793i = j10;
        this.f50794j = j11;
        this.f50795k = j12;
        this.f50796l = j13;
        this.f50797m = j14;
        this.f50798n = f10;
        this.f50799o = z10;
    }
}
