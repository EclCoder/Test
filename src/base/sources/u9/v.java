package u9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f54325c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f54326a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54327b = -1;

    private boolean b(String str) {
        Matcher matcher = f54325c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i10 = Integer.parseInt((String) r0.j(matcher.group(1)), 16);
            int i11 = Integer.parseInt((String) r0.j(matcher.group(2)), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.f54326a = i10;
            this.f54327b = i11;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean a() {
        return (this.f54326a == -1 || this.f54327b == -1) ? false : true;
    }

    public boolean c(ha.a aVar) {
        for (int i10 = 0; i10 < aVar.f(); i10++) {
            ha.a.b bVarE = aVar.e(i10);
            if (bVarE instanceof ma.e) {
                ma.e eVar = (ma.e) bVarE;
                if ("iTunSMPB".equals(eVar.f45382c) && b(eVar.f45383d)) {
                    return true;
                }
            } else if (bVarE instanceof ma.j) {
                ma.j jVar = (ma.j) bVarE;
                if ("com.apple.iTunes".equals(jVar.f45394b) && "iTunSMPB".equals(jVar.f45395c) && b(jVar.f45396d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean d(int i10) {
        int i11 = i10 >> 12;
        int i12 = i10 & 4095;
        if (i11 <= 0 && i12 <= 0) {
            return false;
        }
        this.f54326a = i11;
        this.f54327b = i12;
        return true;
    }
}
