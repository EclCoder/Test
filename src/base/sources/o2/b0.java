package o2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f47981c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47982a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47983b = -1;

    private boolean b(String str) {
        Matcher matcher = f47981c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i10 = Integer.parseInt((String) w1.c0.h(matcher.group(1)), 16);
            int i11 = Integer.parseInt((String) w1.c0.h(matcher.group(2)), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.f47982a = i10;
            this.f47983b = i11;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean a() {
        return (this.f47982a == -1 || this.f47983b == -1) ? false : true;
    }

    public boolean c(t1.u uVar) {
        for (int i10 = 0; i10 < uVar.f(); i10++) {
            t1.u.b bVarE = uVar.e(i10);
            if (bVarE instanceof c3.e) {
                c3.e eVar = (c3.e) bVarE;
                if ("iTunSMPB".equals(eVar.f9515c) && b(eVar.f9516d)) {
                    return true;
                }
            } else if (bVarE instanceof c3.k) {
                c3.k kVar = (c3.k) bVarE;
                if ("com.apple.iTunes".equals(kVar.f9528b) && "iTunSMPB".equals(kVar.f9529c) && b(kVar.f9530d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
