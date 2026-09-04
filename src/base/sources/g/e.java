package g;

import android.content.Context;
import android.content.Intent;
import fl.q;
import fl.w;
import gl.j;
import gl.l0;
import gl.r;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class e extends g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f38827a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent a(String[] input) {
            s.h(input, "input");
            Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
            s.g(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }

        private a() {
        }
    }

    @Override // g.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String[] input) {
        s.h(context, "context");
        s.h(input, "input");
        return f38827a.a(input);
    }

    @Override // g.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public g.a.C0582a b(Context context, String[] input) {
        s.h(context, "context");
        s.h(input, "input");
        if (input.length == 0) {
            return new g.a.C0582a(l0.h());
        }
        for (String str : input) {
            if (androidx.core.content.a.checkSelfPermission(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(yl.g.d(l0.e(input.length), 16));
        for (String str2 : input) {
            q qVarA = w.a(str2, Boolean.TRUE);
            linkedHashMap.put(qVarA.h(), qVarA.i());
        }
        return new g.a.C0582a(linkedHashMap);
    }

    @Override // g.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map c(int i10, Intent intent) {
        if (i10 != -1) {
            return l0.h();
        }
        if (intent == null) {
            return l0.h();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return l0.h();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i11 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i11 == 0));
        }
        return l0.r(r.O0(j.S(stringArrayExtra), arrayList));
    }
}
