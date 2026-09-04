package gg;

import android.content.Context;
import android.hardware.display.VirtualDisplay;
import android.media.AudioManager;
import android.media.MediaRecorder;
import android.media.projection.MediaProjection;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.view.Surface;
import fg.m;
import fg.n;
import java.io.Closeable;
import java.io.File;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class f extends eg.d implements MediaRecorder.OnInfoListener, MediaRecorder.OnErrorListener {
    private AudioManager.AudioRecordingCallback A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private MediaRecorder f39174v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Surface f39175w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private volatile a f39176x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final AtomicBoolean f39177y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Executor f39178z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    private enum a {
        IDLE,
        f39180b,
        PAUSED
    }

    public f(Context context, eg.e eVar, eg.a aVar, String str, MediaProjection mediaProjection, String str2, eg.d.c cVar) {
        super(context, eVar, aVar, str, mediaProjection, str2, cVar);
        this.f39176x = a.IDLE;
        this.f39177y = new AtomicBoolean(false);
    }

    private void t() throws Exception {
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.f39174v = mediaRecorder;
        if (this.f37874q != null) {
            mediaRecorder.setAudioSource(1);
        }
        this.f39174v.setVideoSource(2);
        this.f39174v.setOutputFormat(2);
        this.f39174v.setVideoEncoder(2);
        this.f39174v.setVideoSize(this.f37873p.d(), this.f37873p.c());
        this.f39174v.setVideoFrameRate(this.f37873p.b());
        this.f39174v.setVideoEncodingBitRate(this.f37873p.a());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && (this.f37859b != null || this.f37860c != null)) {
            this.f39174v.setMaxFileSize(this.f37865h);
            wp.a.a("Set max file size: %s", Long.valueOf(this.f37865h));
        }
        int i11 = this.f37870m;
        if (i11 != -1) {
            this.f39174v.setMaxDuration(i11 * 1000);
        }
        if (this.f37874q != null) {
            this.f39174v.setAudioEncoder(3);
            this.f39174v.setAudioSamplingRate(this.f37874q.c());
            this.f39174v.setAudioEncodingBitRate(this.f37874q.a());
            if (i10 >= 29) {
                this.f39174v.registerAudioRecordingCallback(this.f39178z, this.A);
            }
        }
        String str = this.f37859b;
        if (str != null) {
            this.f39174v.setOutputFile(str);
        } else {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.f37858a.getContentResolver().openFileDescriptor(this.f37860c, "w");
            this.f37866i = parcelFileDescriptorOpenFileDescriptor;
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                throw new Exception("Could not open FileDescriptor for URI: " + this.f37860c);
            }
            this.f39174v.setOutputFile(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
        }
        this.f39174v.prepare();
        Surface surface = this.f39174v.getSurface();
        this.f39175w = surface;
        this.f37872o.setSurface(surface);
        this.f39174v.setOnInfoListener(this);
        this.f39174v.setOnErrorListener(this);
    }

    private Exception u() {
        AudioManager.AudioRecordingCallback audioRecordingCallback;
        if (!this.f39177y.compareAndSet(false, true)) {
            return null;
        }
        this.f37869l = true;
        boolean z10 = this.f39176x == a.f39180b || this.f39176x == a.PAUSED;
        this.f39176x = a.IDLE;
        lg.d dVar = new lg.d();
        MediaRecorder mediaRecorder = this.f39174v;
        if (mediaRecorder != null) {
            if (Build.VERSION.SDK_INT >= 29 && (audioRecordingCallback = this.A) != null) {
                mediaRecorder.unregisterAudioRecordingCallback(audioRecordingCallback);
            }
            if (z10) {
                final MediaRecorder mediaRecorder2 = this.f39174v;
                Objects.requireNonNull(mediaRecorder2);
                dVar.a(new Closeable() { // from class: gg.a
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        mediaRecorder2.stop();
                    }
                });
            }
            final MediaRecorder mediaRecorder3 = this.f39174v;
            Objects.requireNonNull(mediaRecorder3);
            dVar.a(new Closeable() { // from class: gg.b
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    mediaRecorder3.release();
                }
            });
        }
        final Surface surface = this.f39175w;
        if (surface != null) {
            Objects.requireNonNull(surface);
            dVar.a(new Closeable() { // from class: gg.c
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    surface.release();
                }
            });
        }
        VirtualDisplay virtualDisplay = this.f37872o;
        if (virtualDisplay != null) {
            Objects.requireNonNull(virtualDisplay);
            dVar.a(new m(virtualDisplay));
        }
        ParcelFileDescriptor parcelFileDescriptor = this.f37866i;
        if (parcelFileDescriptor != null) {
            dVar.a(parcelFileDescriptor);
            this.f37866i = null;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29 && this.f37860c != null) {
            dVar.a(new Closeable() { // from class: gg.d
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    f fVar = this.f39172a;
                    fVar.l(fVar.f37860c);
                }
            });
        }
        if (i10 >= 29) {
            dVar.a(new Closeable() { // from class: gg.e
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    this.f39173a.d();
                }
            });
        }
        MediaProjection mediaProjection = this.f37871n;
        if (mediaProjection != null) {
            Objects.requireNonNull(mediaProjection);
            dVar.a(new n(mediaProjection));
        }
        try {
            dVar.close();
            e = null;
        } catch (Exception e10) {
            e = e10;
        }
        this.f39174v = null;
        this.f37871n = null;
        return e;
    }

    @Override // eg.d
    public void e() {
        Uri uri = this.f37860c;
        String str = this.f37863f;
        boolean z10 = this.f39176x == a.f39180b || this.f39176x == a.PAUSED;
        Exception excU = u();
        if (z10) {
            this.f37875r.a(excU, str, uri);
        }
    }

    @Override // eg.d
    public void j() {
        MediaRecorder mediaRecorder;
        if (this.f39176x != a.f39180b || (mediaRecorder = this.f39174v) == null) {
            return;
        }
        mediaRecorder.pause();
        this.f39176x = a.PAUSED;
    }

    @Override // eg.d
    public void m() {
        MediaRecorder mediaRecorder;
        if (this.f39176x != a.PAUSED || (mediaRecorder = this.f39174v) == null) {
            return;
        }
        mediaRecorder.resume();
        this.f39176x = a.f39180b;
    }

    @Override // eg.d
    public void n(Executor executor, AudioManager.AudioRecordingCallback audioRecordingCallback) {
        this.f39178z = executor;
        this.A = audioRecordingCallback;
    }

    @Override // android.media.MediaRecorder.OnErrorListener
    public void onError(MediaRecorder mediaRecorder, int i10, int i11) {
        wp.a.d("MediaRecorder error: what=%d, extra=%d", Integer.valueOf(i10), Integer.valueOf(i11));
        this.f39176x = a.IDLE;
        u();
        this.f37875r.c(new RuntimeException("MediaRecorder error: what=" + i10 + ", extra=" + i11));
    }

    @Override // android.media.MediaRecorder.OnInfoListener
    public void onInfo(MediaRecorder mediaRecorder, int i10, int i11) {
        MediaRecorder mediaRecorder2;
        eg.d.b bVar;
        if (this.f37869l || (mediaRecorder2 = this.f39174v) == null) {
            return;
        }
        switch (i10) {
            case 800:
                if (this.f37870m > 0 && (bVar = this.f37876s) != null) {
                    bVar.a();
                    break;
                }
                break;
            case 801:
                wp.a.i("Max file size reached — MediaRecorder has auto-stopped.", new Object[0]);
                this.f39176x = a.IDLE;
                u();
                this.f37875r.c(new RuntimeException("Max file size reached"));
                break;
            case 802:
                wp.a.a("Max file size approaching", new Object[0]);
                try {
                    int i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 29 && this.f37860c != null) {
                        if (this.f37867j == null) {
                            wp.a.d("nextFileDescriptor was null at APPROACHING — rotation will be skipped", new Object[0]);
                        } else {
                            mediaRecorder2.setNextOutputFile(this.f37867j.getFileDescriptor());
                            wp.a.a("Handed pre-allocated URI to MediaRecorder: %s", this.f37864g);
                        }
                        break;
                    } else if (this.f37859b != null && i12 >= 26) {
                        p();
                        mediaRecorder2.setNextOutputFile(new File(this.f37863f));
                        break;
                    }
                } catch (Exception e10) {
                    wp.a.f(e10, "Failed to set next output file", new Object[0]);
                    this.f39176x = a.IDLE;
                    u();
                    this.f37875r.c(e10);
                    return;
                }
                break;
            case 803:
                wp.a.a("Next output file started — rotation successful!", new Object[0]);
                this.f37878u++;
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 29 && this.f37860c != null) {
                    try {
                        ParcelFileDescriptor parcelFileDescriptor = this.f37866i;
                        if (parcelFileDescriptor != null) {
                            parcelFileDescriptor.close();
                        }
                    } catch (Exception e11) {
                        wp.a.f(e11, "Failed to close old fileDescriptor after rotation", new Object[0]);
                    }
                    this.f37866i = null;
                    l(this.f37860c);
                    this.f37866i = this.f37867j;
                    this.f37867j = null;
                    Uri uri = this.f37864g;
                    this.f37860c = uri;
                    wp.a.a("Rotation complete. Now writing to: %s", uri);
                    k();
                    break;
                } else if (this.f37859b != null && i13 >= 26) {
                    String str = this.f37863f;
                    this.f37859b = str;
                    wp.a.a("Rotation complete. Now writing to path: %s", str);
                    break;
                }
                break;
        }
    }

    @Override // eg.d
    public void q() {
        try {
            this.f39176x = a.IDLE;
            t();
            this.f39174v.start();
            this.f39176x = a.f39180b;
            if (Build.VERSION.SDK_INT >= 29 && this.f37860c != null) {
                k();
            }
            this.f37875r.b(null);
        } catch (Exception e10) {
            wp.a.e(e10);
            this.f37875r.b(e10);
            e();
        }
    }

    public f(Context context, eg.e eVar, eg.a aVar, Uri uri, MediaProjection mediaProjection, String str, eg.d.c cVar) {
        super(context, eVar, aVar, uri, mediaProjection, str, cVar);
        this.f39176x = a.IDLE;
        this.f39177y = new AtomicBoolean(false);
    }
}
