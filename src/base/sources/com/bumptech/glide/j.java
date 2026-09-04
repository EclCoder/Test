package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.b0;
import com.bumptech.glide.load.resource.bitmap.d0;
import com.bumptech.glide.load.resource.bitmap.f0;
import com.bumptech.glide.load.resource.bitmap.g0;
import com.bumptech.glide.load.resource.bitmap.i0;
import com.bumptech.glide.load.resource.bitmap.j0;
import com.bumptech.glide.load.resource.bitmap.r;
import com.bumptech.glide.load.resource.bitmap.u;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import x5.o;
import x5.s;
import x5.t;
import x5.v;
import x5.w;
import x5.x;
import x5.y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class j {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements m6.f.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f11190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f11191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f11192c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g6.a f11193d;

        a(c cVar, List list, g6.a aVar) {
            this.f11191b = cVar;
            this.f11192c = list;
            this.f11193d = aVar;
        }

        @Override // m6.f.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Registry get() {
            if (this.f11190a) {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
            s4.a.a("Glide registry");
            this.f11190a = true;
            try {
                return j.a(this.f11191b, this.f11192c, this.f11193d);
            } finally {
                this.f11190a = false;
                s4.a.b();
            }
        }
    }

    static Registry a(c cVar, List list, g6.a aVar) {
        u5.d dVarH = cVar.h();
        u5.b bVarG = cVar.g();
        Context applicationContext = cVar.k().getApplicationContext();
        f fVarG = cVar.k().g();
        Registry registry = new Registry();
        b(applicationContext, registry, dVarH, bVarG, fVarG);
        c(applicationContext, cVar, registry, list, aVar);
        return registry;
    }

    private static void b(Context context, Registry registry, u5.d dVar, u5.b bVar, f fVar) {
        r5.i hVar;
        r5.i g0Var;
        Registry registry2;
        registry.o(new DefaultImageHeaderParser());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 27) {
            registry.o(new u());
        }
        Resources resources = context.getResources();
        List listG = registry.g();
        d6.a aVar = new d6.a(context, listG, dVar, bVar);
        r5.i iVarM = j0.m(dVar);
        r rVar = new r(registry.g(), resources.getDisplayMetrics(), dVar, bVar);
        if (i10 < 28 || !fVar.b(d.b.class)) {
            hVar = new com.bumptech.glide.load.resource.bitmap.h(rVar);
            g0Var = new g0(rVar, bVar);
        } else {
            g0Var = new b0();
            hVar = new com.bumptech.glide.load.resource.bitmap.i();
        }
        if (i10 >= 28) {
            registry.e("Animation", InputStream.class, Drawable.class, b6.c.f(listG, bVar));
            registry.e("Animation", ByteBuffer.class, Drawable.class, b6.c.a(listG, bVar));
        }
        b6.g gVar = new b6.g(context);
        com.bumptech.glide.load.resource.bitmap.c cVar = new com.bumptech.glide.load.resource.bitmap.c(bVar);
        e6.a aVar2 = new e6.a();
        e6.d dVar2 = new e6.d();
        ContentResolver contentResolver = context.getContentResolver();
        registry.c(ByteBuffer.class, new x5.c()).c(InputStream.class, new x5.u(bVar)).e("Bitmap", ByteBuffer.class, Bitmap.class, hVar).e("Bitmap", InputStream.class, Bitmap.class, g0Var);
        if (ParcelFileDescriptorRewinder.c()) {
            registry.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new d0(rVar));
        }
        registry.e("Bitmap", AssetFileDescriptor.class, Bitmap.class, j0.c(dVar));
        registry.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, iVarM).b(Bitmap.class, Bitmap.class, w.a.a()).e("Bitmap", Bitmap.class, Bitmap.class, new i0()).d(Bitmap.class, cVar).e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a(resources, hVar)).e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a(resources, g0Var)).e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a(resources, iVarM)).d(BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.b(dVar, cVar)).e("Animation", InputStream.class, d6.c.class, new d6.j(listG, aVar, bVar)).e("Animation", ByteBuffer.class, d6.c.class, aVar).d(d6.c.class, new d6.d()).b(q5.a.class, q5.a.class, w.a.a()).e("Bitmap", q5.a.class, Bitmap.class, new d6.h(dVar)).a(Uri.class, Drawable.class, gVar).a(Uri.class, Bitmap.class, new f0(gVar, dVar)).p(new a6.a.C0002a()).b(File.class, ByteBuffer.class, new x5.d.b()).b(File.class, InputStream.class, new x5.g.e()).a(File.class, File.class, new c6.a()).b(File.class, ParcelFileDescriptor.class, new x5.g.b()).b(File.class, File.class, w.a.a()).p(new com.bumptech.glide.load.data.k.a(bVar));
        if (ParcelFileDescriptorRewinder.c()) {
            registry2 = registry;
            registry2.p(new ParcelFileDescriptorRewinder.a());
        } else {
            registry2 = registry;
        }
        o oVarG = x5.f.g(context);
        o oVarC = x5.f.c(context);
        o oVarE = x5.f.e(context);
        Class cls = Integer.TYPE;
        registry2.b(cls, InputStream.class, oVarG).b(Integer.class, InputStream.class, oVarG).b(cls, AssetFileDescriptor.class, oVarC).b(Integer.class, AssetFileDescriptor.class, oVarC).b(cls, Drawable.class, oVarE).b(Integer.class, Drawable.class, oVarE).b(Uri.class, InputStream.class, t.f(context)).b(Uri.class, AssetFileDescriptor.class, t.e(context));
        s.c cVar2 = new s.c(resources);
        s.a aVar3 = new s.a(resources);
        s.b bVar2 = new s.b(resources);
        registry2.b(Integer.class, Uri.class, cVar2).b(cls, Uri.class, cVar2).b(Integer.class, AssetFileDescriptor.class, aVar3).b(cls, AssetFileDescriptor.class, aVar3).b(Integer.class, InputStream.class, bVar2).b(cls, InputStream.class, bVar2);
        registry2.b(String.class, InputStream.class, new x5.e.c()).b(Uri.class, InputStream.class, new x5.e.c()).b(String.class, InputStream.class, new v.c()).b(String.class, ParcelFileDescriptor.class, new v.b()).b(String.class, AssetFileDescriptor.class, new v.a()).b(Uri.class, InputStream.class, new x5.a.c(context.getAssets())).b(Uri.class, AssetFileDescriptor.class, new x5.a.b(context.getAssets())).b(Uri.class, InputStream.class, new y5.b.a(context)).b(Uri.class, InputStream.class, new y5.c.a(context));
        if (i10 >= 29) {
            registry2.b(Uri.class, InputStream.class, new y5.d.c(context));
            registry2.b(Uri.class, ParcelFileDescriptor.class, new y5.d.b(context));
        }
        boolean zB = fVar.b(d.f.class);
        registry2.b(Uri.class, InputStream.class, new x.d(contentResolver, zB)).b(Uri.class, ParcelFileDescriptor.class, new x.b(contentResolver, zB)).b(Uri.class, AssetFileDescriptor.class, new x.a(contentResolver, zB)).b(Uri.class, InputStream.class, new y.a()).b(URL.class, InputStream.class, new y5.e.a()).b(Uri.class, File.class, new x5.l.a(context)).b(x5.h.class, InputStream.class, new y5.a.C0879a()).b(byte[].class, ByteBuffer.class, new x5.b.a()).b(byte[].class, InputStream.class, new x5.b.d()).b(Uri.class, Uri.class, w.a.a()).b(Drawable.class, Drawable.class, w.a.a()).a(Drawable.class, Drawable.class, new b6.h()).q(Bitmap.class, BitmapDrawable.class, new e6.b(resources)).q(Bitmap.class, byte[].class, aVar2).q(Drawable.class, byte[].class, new e6.c(dVar, aVar2, dVar2)).q(d6.c.class, byte[].class, dVar2);
        r5.i iVarD = j0.d(dVar);
        registry2.a(ByteBuffer.class, Bitmap.class, iVarD);
        registry2.a(ByteBuffer.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a(resources, iVarD));
    }

    private static void c(Context context, c cVar, Registry registry, List list, g6.a aVar) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        if (aVar != null) {
            aVar.a(context, cVar, registry);
        }
    }

    static m6.f.b d(c cVar, List list, g6.a aVar) {
        return new a(cVar, list, aVar);
    }
}
