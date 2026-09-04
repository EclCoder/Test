package com.bykv.vk.openvk.preload.geckox.net;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface INetWork {
    Response doGet(String str);

    Response doPost(String str, String str2);

    Response doPost(String str, List<Pair<String, String>> list);

    void downloadFile(String str, long j10, BufferOutputStream bufferOutputStream);

    void syncDoGet(String str);
}
