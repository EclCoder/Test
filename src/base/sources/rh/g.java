package rh;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import androidx.lifecycle.p0;
import em.c1;
import em.i;
import em.o0;
import fl.g0;
import fl.s;
import gl.r;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.coroutines.jvm.internal.m;
import nh.f0;
import tl.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f51339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p0 f51340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p0 f51341c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends m implements o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f51342r;

        a(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return g.this.new a(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ll.b.f();
            if (this.f51342r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            g gVar = g.this;
            gVar.j(gVar.f51339a);
            return g0.f38750a;
        }
    }

    public g(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        this.f51339a = context;
        this.f51340b = new p0(new ArrayList());
        this.f51341c = new p0(new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(Context context) {
        String name;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList(r.o("_id", "_data", "_display_name"));
        if (Build.VERSION.SDK_INT >= 29) {
            arrayList2.add("volume_name");
            arrayList2.add("bucket_display_name");
        }
        String strI = i();
        String[] strArrH = h();
        Uri uriF = f();
        l(arrayList2);
        Cursor cursorQuery = context.getContentResolver().query(uriF, (String[]) arrayList2.toArray(new String[0]), strI, strArrH, "date_modified DESC");
        if (cursorQuery != null) {
            cursorQuery.moveToFirst();
            while (!cursorQuery.isAfterLast()) {
                long j10 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id"));
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
                if (Build.VERSION.SDK_INT >= 29) {
                    name = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("bucket_display_name"));
                } else {
                    File parentFile = new File(string).getParentFile();
                    name = parentFile != null ? parentFile.getName() : null;
                }
                String strS = f0.s(string2);
                kotlin.jvm.internal.s.e(string);
                kotlin.jvm.internal.s.e(strS);
                arrayList.add(c(cursorQuery, uriF, string, name, strS, j10));
                if (name != null) {
                    hashSet.add(name);
                }
                cursorQuery.moveToNext();
            }
            cursorQuery.close();
        }
        this.f51340b.n(arrayList);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(d());
        arrayList3.addAll(hashSet);
        this.f51341c.n(arrayList3);
    }

    protected abstract ng.c c(Cursor cursor, Uri uri, String str, String str2, String str3, long j10);

    protected abstract String d();

    public final p0 e() {
        return this.f51341c;
    }

    protected abstract Uri f();

    public final p0 g() {
        return this.f51340b;
    }

    protected abstract String[] h();

    protected abstract String i();

    public final Object k(kl.f fVar) {
        Object objJ = i.j(c1.b(), new a(null), fVar);
        return objJ == ll.b.f() ? objJ : g0.f38750a;
    }

    protected abstract void l(ArrayList arrayList);
}
