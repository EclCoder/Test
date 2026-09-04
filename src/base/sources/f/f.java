package f;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.b0;
import androidx.lifecycle.y;
import com.mbridge.msdk.playercommon.PHx.jyeoXJ;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f38123h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f38124a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f38125b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f38126c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f38127d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient Map f38128e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f38129f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f38130g = new Bundle();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f.b f38131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g.a f38132b;

        public a(f.b callback, g.a contract) {
            s.h(callback, "callback");
            s.h(contract, "contract");
            this.f38131a = callback;
            this.f38132b = contract;
        }

        public final f.b a() {
            return this.f38131a;
        }

        public final g.a b() {
            return this.f38132b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.lifecycle.s f38133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f38134b;

        public c(androidx.lifecycle.s lifecycle) {
            s.h(lifecycle, "lifecycle");
            this.f38133a = lifecycle;
            this.f38134b = new ArrayList();
        }

        public final void a(y observer) {
            s.h(observer, "observer");
            this.f38133a.a(observer);
            this.f38134b.add(observer);
        }

        public final void b() {
            Iterator it = this.f38134b.iterator();
            while (it.hasNext()) {
                this.f38133a.d((y) it.next());
            }
            this.f38134b.clear();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d extends f.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f38136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g.a f38137c;

        d(String str, g.a aVar) {
            this.f38136b = str;
            this.f38137c = aVar;
        }

        @Override // f.c
        public g.a a() {
            return this.f38137c;
        }

        @Override // f.c
        public void c(Object obj, androidx.core.app.c cVar) throws Exception {
            Object obj2 = f.this.f38125b.get(this.f38136b);
            g.a aVar = this.f38137c;
            if (obj2 != null) {
                int iIntValue = ((Number) obj2).intValue();
                f.this.f38127d.add(this.f38136b);
                try {
                    f.this.k(iIntValue, this.f38137c, obj, cVar);
                    return;
                } catch (Exception e10) {
                    f.this.f38127d.remove(this.f38136b);
                    throw e10;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // f.c
        public void d() {
            f.this.r(this.f38136b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class e extends f.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f38139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g.a f38140c;

        e(String str, g.a aVar) {
            this.f38139b = str;
            this.f38140c = aVar;
        }

        @Override // f.c
        public g.a a() {
            return this.f38140c;
        }

        @Override // f.c
        public void d() {
            f.this.r(this.f38139b);
        }

        @Override // f.c
        public void c(Object obj, androidx.core.app.c cVar) throws Exception {
            Object obj2 = f.this.f38125b.get(this.f38139b);
            g.a aVar = this.f38140c;
            if (obj2 != null) {
                int iIntValue = ((Number) obj2).intValue();
                f.this.f38127d.add(this.f38139b);
                try {
                    f.this.k(iIntValue, this.f38140c, obj, cVar);
                    return;
                } catch (Exception e10) {
                    f.this.f38127d.remove(this.f38139b);
                    throw e10;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + jyeoXJ.CeiJRrPPLZVTDq + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
    }

    private final void e(int i10, String str) {
        this.f38124a.put(Integer.valueOf(i10), str);
        this.f38125b.put(str, Integer.valueOf(i10));
    }

    private final void h(String str, int i10, Intent intent, a aVar) {
        if ((aVar != null ? aVar.a() : null) == null || !this.f38127d.contains(str)) {
            this.f38129f.remove(str);
            this.f38130g.putParcelable(str, new f.a(i10, intent));
        } else {
            aVar.a().a(aVar.b().c(i10, intent));
            this.f38127d.remove(str);
        }
    }

    private final int i() {
        for (Number number : am.j.h(new tl.a() { // from class: f.e
            @Override // tl.a
            public final Object invoke() {
                return f.j();
            }
        })) {
            if (!this.f38124a.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer j() {
        return Integer.valueOf(wl.c.f56362a.i(2147418112) + C.DEFAULT_BUFFER_SEGMENT_SIZE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(f fVar, String str, f.b bVar, g.a aVar, b0 b0Var, androidx.lifecycle.s.a event) {
        s.h(b0Var, "<unused var>");
        s.h(event, "event");
        if (androidx.lifecycle.s.a.ON_START != event) {
            if (androidx.lifecycle.s.a.ON_STOP == event) {
                fVar.f38128e.remove(str);
                return;
            } else {
                if (androidx.lifecycle.s.a.ON_DESTROY == event) {
                    fVar.r(str);
                    return;
                }
                return;
            }
        }
        fVar.f38128e.put(str, new a(bVar, aVar));
        if (fVar.f38129f.containsKey(str)) {
            Object obj = fVar.f38129f.get(str);
            fVar.f38129f.remove(str);
            bVar.a(obj);
        }
        f.a aVar2 = (f.a) j0.d.a(fVar.f38130g, str, f.a.class);
        if (aVar2 != null) {
            fVar.f38130g.remove(str);
            bVar.a(aVar.c(aVar2.b(), aVar2.a()));
        }
    }

    private final void q(String str) {
        if (((Integer) this.f38125b.get(str)) != null) {
            return;
        }
        e(i(), str);
    }

    public final boolean f(int i10, int i11, Intent intent) {
        String str = (String) this.f38124a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        h(str, i11, intent, (a) this.f38128e.get(str));
        return true;
    }

    public final boolean g(int i10, Object obj) {
        String str = (String) this.f38124a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f38128e.get(str);
        if ((aVar != null ? aVar.a() : null) == null) {
            this.f38130g.remove(str);
            this.f38129f.put(str, obj);
            return true;
        }
        f.b bVarA = aVar.a();
        s.f(bVarA, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.f38127d.remove(str)) {
            return true;
        }
        bVarA.a(obj);
        return true;
    }

    public abstract void k(int i10, g.a aVar, Object obj, androidx.core.app.c cVar);

    public final void l(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.f38127d.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle2 != null) {
            this.f38130g.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = stringArrayList.get(i10);
            if (this.f38125b.containsKey(str)) {
                Integer num = (Integer) this.f38125b.remove(str);
                if (!this.f38130g.containsKey(str)) {
                    p0.d(this.f38124a).remove(num);
                }
            }
            Integer num2 = integerArrayList.get(i10);
            s.g(num2, "get(...)");
            int iIntValue = num2.intValue();
            String str2 = stringArrayList.get(i10);
            s.g(str2, "get(...)");
            e(iIntValue, str2);
        }
    }

    public final void m(Bundle outState) {
        s.h(outState, "outState");
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f38125b.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f38125b.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f38127d));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.f38130g));
    }

    public final f.c n(final String key, b0 lifecycleOwner, final g.a contract, final f.b callback) {
        s.h(key, "key");
        s.h(lifecycleOwner, "lifecycleOwner");
        s.h(contract, "contract");
        s.h(callback, "callback");
        androidx.lifecycle.s lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.b().e(androidx.lifecycle.s.b.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        q(key);
        c cVar = (c) this.f38126c.get(key);
        if (cVar == null) {
            cVar = new c(lifecycle);
        }
        cVar.a(new y() { // from class: f.d
            @Override // androidx.lifecycle.y
            public final void c(b0 b0Var, androidx.lifecycle.s.a aVar) {
                f.p(this.f38119a, key, callback, contract, b0Var, aVar);
            }
        });
        this.f38126c.put(key, cVar);
        return new d(key, contract);
    }

    public final f.c o(String key, g.a contract, f.b callback) {
        s.h(key, "key");
        s.h(contract, "contract");
        s.h(callback, "callback");
        q(key);
        this.f38128e.put(key, new a(callback, contract));
        if (this.f38129f.containsKey(key)) {
            Object obj = this.f38129f.get(key);
            this.f38129f.remove(key);
            callback.a(obj);
        }
        f.a aVar = (f.a) j0.d.a(this.f38130g, key, f.a.class);
        if (aVar != null) {
            this.f38130g.remove(key);
            callback.a(contract.c(aVar.b(), aVar.a()));
        }
        return new e(key, contract);
    }

    public final void r(String key) {
        Integer num;
        s.h(key, "key");
        if (!this.f38127d.contains(key) && (num = (Integer) this.f38125b.remove(key)) != null) {
            this.f38124a.remove(num);
        }
        this.f38128e.remove(key);
        if (this.f38129f.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + this.f38129f.get(key));
            this.f38129f.remove(key);
        }
        if (this.f38130g.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((f.a) j0.d.a(this.f38130g, key, f.a.class)));
            this.f38130g.remove(key);
        }
        c cVar = (c) this.f38126c.get(key);
        if (cVar != null) {
            cVar.b();
            this.f38126c.remove(key);
        }
    }
}
