package eg;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.hardware.display.VirtualDisplay;
import android.media.AudioManager;
import android.media.MediaScannerConnection;
import android.media.projection.MediaProjection;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f37858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f37859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Uri f37860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f37861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f37862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f37863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected volatile Uri f37864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected long f37865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected ParcelFileDescriptor f37866i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected volatile ParcelFileDescriptor f37867j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final AtomicBoolean f37868k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected volatile boolean f37869l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected int f37870m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected MediaProjection f37871n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected VirtualDisplay f37872o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected e f37873p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected eg.a f37874q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected c f37875r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected b f37876s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected a f37877t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected int f37878u;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f37879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f37880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f37881c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f37882d;

        public a(long j10, long j11, long j12, long j13) {
            this.f37879a = j10;
            this.f37880b = j11;
            this.f37881c = j12;
            this.f37882d = j13;
        }

        public boolean a() {
            long j10 = this.f37879a;
            return j10 >= 100 && ((double) this.f37880b) >= ((double) j10) * 0.98d;
        }

        public boolean b() {
            long j10 = this.f37881c;
            return j10 >= 100 && ((double) this.f37882d) >= ((double) j10) * 0.98d;
        }

        public String toString() {
            return "AudioSilenceStats{internal " + this.f37880b + "/" + this.f37879a + ", output " + this.f37882d + "/" + this.f37881c + ", internalSilent=" + a() + ", outputSilent=" + b() + '}';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        void a(Throwable th2, String str, Uri uri);

        void b(Throwable th2);

        void c(Throwable th2);

        void d(Throwable th2);
    }

    public d(Context context, e eVar, eg.a aVar, String str, MediaProjection mediaProjection, String str2, c cVar) {
        this(context, eVar, aVar, mediaProjection, str2, cVar);
        this.f37859b = str;
        this.f37863f = str;
        this.f37865h = 3758096384L;
    }

    public static /* synthetic */ void a(d dVar, Uri uri) {
        dVar.getClass();
        try {
            dVar.f37858a.getContentResolver().delete(uri, null, null);
            wp.a.a("Deleted unused pre-allocated URI: %s", uri);
        } catch (Exception e10) {
            wp.a.f(e10, "Failed to delete unused nextOutputUri", new Object[0]);
        }
    }

    public static /* synthetic */ void b(d dVar) {
        dVar.getClass();
        try {
            try {
                dVar.c();
                if (dVar.f37869l) {
                    dVar.d();
                }
            } catch (Exception e10) {
                wp.a.f(e10, "Failed to pre-allocate next URI", new Object[0]);
                dVar.f37864g = null;
                dVar.f37867j = null;
            }
        } finally {
            dVar.f37868k.set(false);
        }
    }

    private String h() {
        this.f37862e++;
        return this.f37861d + "(" + this.f37862e + ")";
    }

    private VirtualDisplay i(DisplayMetrics displayMetrics) {
        return this.f37871n.createVirtualDisplay("Recording Display", this.f37873p.d(), this.f37873p.c(), displayMetrics.densityDpi, 16, null, null, null);
    }

    protected void c() throws Exception {
        ContentResolver contentResolver = this.f37858a.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", h() + ".mp4");
        contentValues.put("mime_type", MimeTypes.VIDEO_MP4);
        contentValues.put("date_added", Long.valueOf(System.currentTimeMillis() / 1000));
        contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("relative_path", "Movies/AzScreenRecorder/");
        contentValues.put("is_pending", (Integer) 1);
        this.f37864g = contentResolver.insert(MediaStore.Video.Media.getContentUri("external_primary"), contentValues);
        if (this.f37864g == null) {
            throw new Exception("Insert returned null URI");
        }
        this.f37867j = contentResolver.openFileDescriptor(this.f37864g, "w");
    }

    protected void d() {
        if (this.f37867j != null) {
            try {
                this.f37867j.close();
            } catch (Exception e10) {
                wp.a.f(e10, "Failed to close unused nextFileDescriptor", new Object[0]);
            }
            this.f37867j = null;
        }
        if (this.f37864g == null || this.f37864g.equals(this.f37860c)) {
            return;
        }
        final Uri uri = this.f37864g;
        new Thread(new Runnable() { // from class: eg.c
            @Override // java.lang.Runnable
            public final void run() {
                d.a(this.f37856a, uri);
            }
        }).start();
        this.f37864g = null;
    }

    public abstract void e();

    public a f() {
        return this.f37877t;
    }

    public int g() {
        return this.f37878u;
    }

    public abstract void j();

    protected void k() {
        if (this.f37868k.compareAndSet(false, true)) {
            new Thread(new Runnable() { // from class: eg.b
                @Override // java.lang.Runnable
                public final void run() {
                    d.b(this.f37855a);
                }
            }, "RecordEngine-PreAllocate").start();
        }
    }

    protected void l(Uri uri) {
        if (uri != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("is_pending", (Integer) 0);
                this.f37858a.getContentResolver().update(uri, contentValues, null, null);
                wp.a.a("Published URI so Gallery can see it: %s", uri);
            } catch (Exception e10) {
                wp.a.f(e10, "Failed to publish URI", new Object[0]);
            }
        }
    }

    public abstract void m();

    public abstract void n(Executor executor, AudioManager.AudioRecordingCallback audioRecordingCallback);

    public void o(int i10, b bVar) {
        this.f37870m = i10;
        this.f37876s = bVar;
    }

    protected void p() {
        MediaScannerConnection.scanFile(this.f37858a, new String[]{this.f37863f}, null, null);
        this.f37863f = this.f37859b.replace(this.f37861d, h());
    }

    public abstract void q();

    public d(Context context, e eVar, eg.a aVar, Uri uri, MediaProjection mediaProjection, String str, c cVar) {
        this(context, eVar, aVar, mediaProjection, str, cVar);
        this.f37860c = uri;
        this.f37864g = uri;
        this.f37865h = 10737418240L;
    }

    public d(Context context, e eVar, eg.a aVar, MediaProjection mediaProjection, String str, c cVar) {
        this.f37862e = 0;
        this.f37868k = new AtomicBoolean(false);
        this.f37869l = false;
        this.f37870m = -1;
        this.f37878u = 1;
        this.f37858a = context;
        this.f37871n = mediaProjection;
        this.f37873p = eVar;
        this.f37874q = aVar;
        this.f37875r = cVar;
        this.f37861d = str;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        try {
            this.f37872o = i(displayMetrics);
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
        this.f37862e = 0;
    }
}
