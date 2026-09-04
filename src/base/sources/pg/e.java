package pg;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class e extends d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f50049l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f50050m;

    public e(int i10, long j10, String str, String str2, long j11, Uri uri, long j12, String str3, long j13) {
        super(i10, j10, str, str2, j11, uri, j12, str3);
        this.f50049l = j13;
    }

    @Override // pg.d
    public String g() {
        return this.f50041d;
    }

    public String q() {
        String str = this.f50041d;
        if (str == null) {
            return null;
        }
        int length = str.length();
        return !this.f50041d.contains("az_recorder_") ? this.f50041d.substring(0, length - 4) : this.f50041d.substring(12, length - 4);
    }

    public long r() {
        return this.f50049l;
    }

    public String s() {
        return this.f50050m;
    }

    public boolean t() {
        return this.f50050m != null;
    }

    public void u(long j10) {
        this.f50049l = j10;
    }

    public void v(String str) {
        this.f50050m = str;
    }

    public e(int i10, long j10, String str, String str2, long j11, Uri uri, long j12, String str3, long j13, long j14) {
        super(i10, j10, str, str2, j11, uri, j12, str3, j14);
        this.f50049l = j13;
    }
}
