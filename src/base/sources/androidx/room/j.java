package androidx.room;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class j implements p4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f7188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f7189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p4.c f7190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f7191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f7192g;

    j(Context context, String str, File file, int i10, p4.c cVar) {
        this.f7186a = context;
        this.f7187b = str;
        this.f7188c = file;
        this.f7189d = i10;
        this.f7190e = cVar;
    }

    private void a(File file) throws IOException {
        ReadableByteChannel channel;
        if (this.f7187b != null) {
            channel = Channels.newChannel(this.f7186a.getAssets().open(this.f7187b));
        } else {
            if (this.f7188c == null) {
                throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
            }
            channel = new FileInputStream(this.f7188c).getChannel();
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f7186a.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        m4.d.a(channel, new FileOutputStream(fileCreateTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        if (fileCreateTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private void d() {
        String databaseName = getDatabaseName();
        File databasePath = this.f7186a.getDatabasePath(databaseName);
        a aVar = this.f7191f;
        m4.a aVar2 = new m4.a(databaseName, this.f7186a.getFilesDir(), aVar == null || aVar.f7091j);
        try {
            aVar2.b();
            if (!databasePath.exists()) {
                try {
                    a(databasePath);
                    aVar2.c();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            }
            if (this.f7191f == null) {
                aVar2.c();
                return;
            }
            try {
                int iC = m4.c.c(databasePath);
                int i10 = this.f7189d;
                if (iC == i10) {
                    aVar2.c();
                    return;
                }
                if (this.f7191f.a(iC, i10)) {
                    aVar2.c();
                    return;
                }
                if (this.f7186a.deleteDatabase(databaseName)) {
                    try {
                        a(databasePath);
                    } catch (IOException e11) {
                        Log.w("ROOM", "Unable to copy database file.", e11);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                aVar2.c();
                return;
            } catch (IOException e12) {
                Log.w("ROOM", "Unable to read database version.", e12);
                aVar2.c();
                return;
            }
        } catch (Throwable th2) {
            aVar2.c();
            throw th2;
        }
        aVar2.c();
        throw th2;
    }

    void c(a aVar) {
        this.f7191f = aVar;
    }

    @Override // p4.c, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f7190e.close();
        this.f7192g = false;
    }

    @Override // p4.c
    public String getDatabaseName() {
        return this.f7190e.getDatabaseName();
    }

    @Override // p4.c
    public synchronized p4.b getWritableDatabase() {
        try {
            if (!this.f7192g) {
                d();
                this.f7192g = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f7190e.getWritableDatabase();
    }

    @Override // p4.c
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f7190e.setWriteAheadLoggingEnabled(z10);
    }
}
