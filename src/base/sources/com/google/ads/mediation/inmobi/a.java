package com.google.ads.mediation.inmobi;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class a extends AsyncTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f16305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final l f16306c = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f16304a = 10;

    /* JADX INFO: renamed from: com.google.ads.mediation.inmobi.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class CallableC0276a implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ URL f16307a;

        CallableC0276a(URL url) {
            this.f16307a = url;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Drawable call() {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(this.f16307a.openStream());
            bitmapDecodeStream.setDensity(160);
            return new BitmapDrawable(Resources.getSystem(), bitmapDecodeStream);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface b {
        void a(HashMap map);

        void b();
    }

    public a(b bVar) {
        this.f16305b = bVar;
    }

    private Future b(URL url, ExecutorService executorService) {
        return executorService.submit(new CallableC0276a(url));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public HashMap doInBackground(Object... objArr) {
        Drawable drawableB;
        HashMap map = (HashMap) objArr[0];
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        try {
            if (this.f16306c.b(String.valueOf(map.get("icon_key"))) != null) {
                drawableB = this.f16306c.b(String.valueOf(map.get("icon_key")));
            } else {
                Drawable drawable = (Drawable) b((URL) map.get("icon_key"), executorServiceNewCachedThreadPool).get(this.f16304a, TimeUnit.SECONDS);
                this.f16306c.d(String.valueOf(map.get("icon_key")), drawable);
                drawableB = drawable;
            }
            HashMap map2 = new HashMap();
            map2.put("icon_key", drawableB);
            return map2;
        } catch (InterruptedException e10) {
            e = e10;
            e.printStackTrace();
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            e.printStackTrace();
            return null;
        } catch (TimeoutException e12) {
            e = e12;
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(HashMap map) {
        super.onPostExecute(map);
        if (map != null) {
            this.f16305b.a(map);
        } else {
            this.f16305b.b();
        }
    }
}
