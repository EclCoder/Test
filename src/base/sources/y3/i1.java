package y3;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\b\u0017\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0014\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Ly3/i1;", "Ly3/z1;", "Ly3/g1;", "Ly3/a2;", "navigatorProvider", "<init>", "(Ly3/a2;)V", "Ly3/y;", "entry", "Ly3/m1;", "navOptions", "Ly3/z1$a;", "navigatorExtras", "Lfl/g0;", CampaignEx.JSON_KEY_AD_R, "(Ly3/y;Ly3/m1;Ly3/z1$a;)V", CampaignEx.JSON_KEY_AD_Q, "()Ly3/g1;", "", "entries", "g", "(Ljava/util/List;Ly3/m1;Ly3/z1$a;)V", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ly3/a2;", "e", "a", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@z1.b(NotificationCompat.CATEGORY_NAVIGATION)
public class i1 extends z1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a2 navigatorProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(a2 navigatorProvider) {
        super(NotificationCompat.CATEGORY_NAVIGATION);
        kotlin.jvm.internal.s.h(navigatorProvider, "navigatorProvider");
        this.navigatorProvider = navigatorProvider;
    }

    private final void r(y entry, m1 navOptions, z1.a navigatorExtras) {
        fl.q[] qVarArr;
        d1 d1VarD = entry.d();
        kotlin.jvm.internal.s.f(d1VarD, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        g1 g1Var = (g1) d1VarD;
        final kotlin.jvm.internal.k0 k0Var = new kotlin.jvm.internal.k0();
        k0Var.f43597a = entry.b();
        int iP = g1Var.P();
        String strQ = g1Var.Q();
        if (iP == 0 && strQ == null) {
            throw new IllegalStateException(("no start destination defined via app:startDestination for " + g1Var.o()).toString());
        }
        d1 d1VarL = strQ != null ? g1Var.L(strQ, false) : (d1) g1Var.N().f(iP);
        if (d1VarL == null) {
            throw new IllegalArgumentException("navigation destination " + g1Var.O() + " is not a direct child of this NavGraph");
        }
        if (strQ != null) {
            if (!kotlin.jvm.internal.s.c(strQ, d1VarL.x())) {
                d1.b bVarA = d1VarL.A(strQ);
                Bundle bundleC = bVarA != null ? bVarA.c() : null;
                if (bundleC != null && !n4.c.v(n4.c.a(bundleC))) {
                    Map mapH = gl.l0.h();
                    if (mapH.isEmpty()) {
                        qVarArr = new fl.q[0];
                    } else {
                        ArrayList arrayList = new ArrayList(mapH.size());
                        for (Map.Entry entry2 : mapH.entrySet()) {
                            arrayList.add(fl.w.a((String) entry2.getKey(), entry2.getValue()));
                        }
                        qVarArr = (fl.q[]) arrayList.toArray(new fl.q[0]);
                    }
                    Bundle bundleA = j0.e.a((fl.q[]) Arrays.copyOf(qVarArr, qVarArr.length));
                    Bundle bundleA2 = n4.k.a(bundleA);
                    n4.k.b(bundleA2, bundleC);
                    Bundle bundle = (Bundle) k0Var.f43597a;
                    if (bundle != null) {
                        n4.k.b(bundleA2, bundle);
                    }
                    k0Var.f43597a = bundleA;
                }
            }
            if (!d1VarL.m().isEmpty()) {
                List listA = w.a(d1VarL.m(), new Function1() { // from class: y3.h1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(i1.s(k0Var, (String) obj));
                    }
                });
                if (!listA.isEmpty()) {
                    throw new IllegalArgumentException(("Cannot navigate to startDestination " + d1VarL + ". Missing required arguments [" + listA + ']').toString());
                }
            }
        }
        this.navigatorProvider.d(d1VarL.v()).g(gl.r.e(d().b(d1VarL, d1VarL.d((Bundle) k0Var.f43597a))), navOptions, navigatorExtras);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(kotlin.jvm.internal.k0 k0Var, String key) {
        kotlin.jvm.internal.s.h(key, "key");
        Object obj = k0Var.f43597a;
        return obj == null || !n4.c.b(n4.c.a((Bundle) obj), key);
    }

    @Override // y3.z1
    public void g(List entries, m1 navOptions, z1.a navigatorExtras) {
        kotlin.jvm.internal.s.h(entries, "entries");
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            r((y) it.next(), navOptions, navigatorExtras);
        }
    }

    @Override // y3.z1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public g1 c() {
        return new g1(this);
    }
}
