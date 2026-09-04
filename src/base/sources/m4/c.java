package m4;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.h;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static void a(p4.b bVar) {
        int i10;
        ArrayList arrayList = new ArrayList();
        Cursor cursorV0 = bVar.v0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (true) {
            try {
                i10 = 0;
                if (!cursorV0.moveToNext()) {
                    break;
                } else {
                    arrayList.add(cursorV0.getString(0));
                }
            } catch (Throwable th2) {
                cursorV0.close();
                throw th2;
            }
        }
        cursorV0.close();
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str = (String) obj;
            if (str.startsWith("room_fts_content_sync_")) {
                bVar.B("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static Cursor b(h hVar, p4.e eVar, boolean z10, CancellationSignal cancellationSignal) {
        Cursor cursorQ = hVar.q(eVar, cancellationSignal);
        if (!z10 || !(cursorQ instanceof AbstractWindowedCursor)) {
            return cursorQ;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorQ;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? b.a(abstractWindowedCursor) : cursorQ;
    }

    public static int c(File file) throws Throwable {
        Throwable th2;
        FileChannel fileChannel = null;
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            try {
                channel.tryLock(60L, 4L, true);
                channel.position(60L);
                if (channel.read(byteBufferAllocate) != 4) {
                    throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
                }
                byteBufferAllocate.rewind();
                int i10 = byteBufferAllocate.getInt();
                channel.close();
                return i10;
            } catch (Throwable th3) {
                th2 = th3;
                fileChannel = channel;
                if (fileChannel == null) {
                    throw th2;
                }
                fileChannel.close();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }
}
