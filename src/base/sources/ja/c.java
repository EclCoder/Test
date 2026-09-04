package ja;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f42201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DataOutputStream f42202b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f42201a = byteArrayOutputStream;
        this.f42202b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(a aVar) {
        this.f42201a.reset();
        try {
            b(this.f42202b, aVar.f42195a);
            String str = aVar.f42196b;
            if (str == null) {
                str = "";
            }
            b(this.f42202b, str);
            this.f42202b.writeLong(aVar.f42197c);
            this.f42202b.writeLong(aVar.f42198d);
            this.f42202b.write(aVar.f42199e);
            this.f42202b.flush();
            return this.f42201a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
