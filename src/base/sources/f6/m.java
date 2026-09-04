package f6;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f38260a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o.b f38261b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class b implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f0 f38264a;

        b(f0 f0Var) {
            this.f38264a = f0Var;
        }

        private void b(f0 f0Var, Set set) {
            List listZ0 = f0Var.z0();
            int size = listZ0.size();
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = (Fragment) listZ0.get(i10);
                b(fragment.getChildFragmentManager(), set);
                com.bumptech.glide.l lVarA = m.this.a(fragment.getLifecycle());
                if (lVarA != null) {
                    set.add(lVarA);
                }
            }
        }

        @Override // f6.p
        public Set a() {
            HashSet hashSet = new HashSet();
            b(this.f38264a, hashSet);
            return hashSet;
        }
    }

    m(o.b bVar) {
        this.f38261b = bVar;
    }

    com.bumptech.glide.l a(androidx.lifecycle.s sVar) {
        m6.l.a();
        return (com.bumptech.glide.l) this.f38260a.get(sVar);
    }

    com.bumptech.glide.l b(Context context, com.bumptech.glide.c cVar, androidx.lifecycle.s sVar, f0 f0Var, boolean z10) {
        m6.l.a();
        com.bumptech.glide.l lVarA = a(sVar);
        if (lVarA != null) {
            return lVarA;
        }
        k kVar = new k(sVar);
        com.bumptech.glide.l lVarA2 = this.f38261b.a(cVar, kVar, new b(f0Var), context);
        this.f38260a.put(sVar, lVarA2);
        kVar.d(new a(sVar));
        if (z10) {
            lVarA2.onStart();
        }
        return lVarA2;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.s f38262a;

        a(androidx.lifecycle.s sVar) {
            this.f38262a = sVar;
        }

        @Override // f6.l
        public void onDestroy() {
            m.this.f38260a.remove(this.f38262a);
        }

        @Override // f6.l
        public void onStart() {
        }

        @Override // f6.l
        public void onStop() {
        }
    }
}
