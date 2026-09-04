/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0002c748
 * Address  : 0002c748
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0002c748(void)

{
  undefined1 uVar1;
  undefined1 uVar2;
  undefined1 uVar3;
  undefined1 uVar4;
  undefined4 *puVar5;
  undefined4 *puVar6;
  uint uVar7;
  int iVar8;
  undefined1 *puVar9;
  undefined4 *puVar10;
  undefined4 uVar11;
  undefined4 local_30;
  undefined4 *local_2c;
  uint local_28;
  int local_24;
  
  local_24 = **(int **)(DAT_0002caac + 0x2c75c);
  puVar5 = (undefined4 *)FUN_000a0370(0x14);
  *puVar5 = 0;
  puVar5[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar5[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar5[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  puVar5[4] = 0x3f800000;
  dlerror();
  puVar6 = (undefined4 *)FUN_000a0398(8);
  uVar11 = 0;
  *puVar6 = 0;
  *(undefined1 *)puVar6 = 0x6c;
  *(undefined1 *)((int)puVar6 + 1) = 0x69;
  *(undefined1 *)((int)puVar6 + 2) = 0x62;
  puVar6[1] = 0;
  *(undefined1 *)((int)puVar6 + 3) = 99;
  *(undefined1 *)(puVar6 + 1) = 0x2e;
  *(undefined1 *)((int)puVar6 + 5) = 0x73;
  *(undefined1 *)((int)puVar6 + 6) = 0x6f;
  *(undefined1 *)((int)puVar6 + 7) = 0;
  local_2c = *(undefined4 **)((int)puVar6 + 3);
  local_30 = CONCAT13(*(undefined1 *)((int)puVar6 + 2),
                      CONCAT12(*(undefined1 *)((int)puVar6 + 1),CONCAT11(*(undefined1 *)puVar6,0xe))
                     );
  local_28 = local_28 & 0xffffff00;
  FUN_00023f74();
  uVar7 = local_28;
  if ((local_30 & 1) == 0) {
    uVar7 = (uint)&local_30 | 1;
  }
  iVar8 = dlopen(uVar7,1);
  if ((local_30 & 1) != 0) {
    FUN_00023f68(local_28,local_30 & 0xfffffffe);
  }
  if (iVar8 != 0) {
    puVar6 = (undefined4 *)FUN_000a0398(0x20);
    *puVar6 = 0;
    puVar6[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
    puVar6[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
    puVar6[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
    puVar10 = puVar6 + 4;
    *(undefined1 *)puVar6 = 0x5f;
    *(undefined1 *)((int)puVar6 + 1) = 0x5f;
    *(undefined1 *)((int)puVar6 + 2) = 0x73;
    *(undefined1 *)((int)puVar6 + 3) = 0x79;
    *(undefined1 *)(puVar6 + 1) = 0x73;
    *(undefined1 *)((int)puVar6 + 5) = 0x74;
    *(undefined1 *)((int)puVar6 + 6) = 0x65;
    *(undefined1 *)((int)puVar6 + 7) = 0x6d;
    *(undefined1 *)(puVar6 + 2) = 0x5f;
    *(undefined1 *)((int)puVar6 + 9) = 0x70;
    *(undefined1 *)((int)puVar6 + 10) = 0x72;
    *(undefined1 *)((int)puVar6 + 0xb) = 0x6f;
    *(undefined1 *)(puVar6 + 3) = 0x70;
    *(undefined1 *)((int)puVar6 + 0xd) = 0x65;
    *(undefined1 *)((int)puVar6 + 0xe) = 0x72;
    *(undefined1 *)((int)puVar6 + 0xf) = 0x74;
    *puVar10 = 0;
    puVar6[5] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
    puVar6[6] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
    puVar6[7] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
    *(undefined1 *)puVar10 = 0x79;
    *(undefined1 *)((int)puVar6 + 0x11) = 0x5f;
    *(undefined1 *)((int)puVar6 + 0x12) = 0x72;
    *(undefined1 *)((int)puVar6 + 0x13) = 0x65;
    *(undefined1 *)(puVar6 + 5) = 0x61;
    *(undefined1 *)((int)puVar6 + 0x15) = 100;
    *(undefined1 *)((int)puVar6 + 0x16) = 0x5f;
    *(undefined1 *)((int)puVar6 + 0x17) = 99;
    *(undefined1 *)(puVar6 + 6) = 0x61;
    *(undefined1 *)((int)puVar6 + 0x19) = 0x6c;
    *(undefined1 *)((int)puVar6 + 0x1a) = 0x6c;
    *(undefined1 *)((int)puVar6 + 0x1b) = 0x62;
    *(undefined1 *)(puVar6 + 7) = 0x61;
    *(undefined1 *)((int)puVar6 + 0x1d) = 99;
    *(undefined1 *)((int)puVar6 + 0x1e) = 0x6b;
    *(undefined1 *)((int)puVar6 + 0x1f) = 0;
    puVar9 = (undefined1 *)FUN_000a0370(0x20);
    uVar1 = *(undefined1 *)((int)puVar6 + 1);
    *puVar9 = *(undefined1 *)puVar6;
    uVar2 = *(undefined1 *)((int)puVar6 + 2);
    puVar9[1] = uVar1;
    uVar1 = *(undefined1 *)((int)puVar6 + 3);
    puVar9[2] = uVar2;
    uVar2 = *(undefined1 *)(puVar6 + 1);
    puVar9[3] = uVar1;
    uVar1 = *(undefined1 *)((int)puVar6 + 5);
    puVar9[4] = uVar2;
    uVar2 = *(undefined1 *)((int)puVar6 + 6);
    puVar9[5] = uVar1;
    uVar1 = *(undefined1 *)((int)puVar6 + 7);
    puVar9[6] = uVar2;
    uVar2 = *(undefined1 *)(puVar6 + 2);
    puVar9[7] = uVar1;
    uVar1 = *(undefined1 *)((int)puVar6 + 9);
    puVar9[8] = uVar2;
    uVar2 = *(undefined1 *)((int)puVar6 + 10);
    puVar9[9] = uVar1;
    uVar1 = *(undefined1 *)((int)puVar6 + 0xb);
    puVar9[10] = uVar2;
    uVar2 = *(undefined1 *)(puVar6 + 3);
    puVar9[0xb] = uVar1;
    uVar1 = *(undefined1 *)((int)puVar6 + 0xd);
    puVar9[0xc] = uVar2;
    uVar2 = *(undefined1 *)((int)puVar6 + 0xe);
    puVar9[0xd] = uVar1;
    uVar1 = *(undefined1 *)((int)puVar6 + 0xf);
    uVar3 = *(undefined1 *)puVar10;
    uVar4 = *(undefined1 *)((int)puVar6 + 0x11);
    puVar9[0xe] = uVar2;
    uVar2 = *(undefined1 *)((int)puVar6 + 0x12);
    puVar9[0xf] = uVar1;
    uVar1 = *(undefined1 *)((int)puVar6 + 0x13);
    puVar9[0x10] = uVar3;
    uVar3 = *(undefined1 *)(puVar6 + 5);
    puVar9[0x11] = uVar4;
    uVar4 = *(undefined1 *)((int)puVar6 + 0x15);
    puVar9[0x12] = uVar2;
    uVar2 = *(undefined1 *)((int)puVar6 + 0x16);
    puVar9[0x13] = uVar1;
    uVar1 = *(undefined1 *)((int)puVar6 + 0x17);
    puVar9[0x14] = uVar3;
    uVar3 = *(undefined1 *)(puVar6 + 6);
    puVar9[0x15] = uVar4;
    uVar4 = *(undefined1 *)((int)puVar6 + 0x19);
    puVar9[0x16] = uVar2;
    uVar2 = *(undefined1 *)((int)puVar6 + 0x1a);
    puVar9[0x17] = uVar1;
    uVar1 = *(undefined1 *)((int)puVar6 + 0x1b);
    puVar9[0x18] = uVar3;
    uVar3 = *(undefined1 *)(puVar6 + 7);
    puVar9[0x19] = uVar4;
    uVar4 = *(undefined1 *)((int)puVar6 + 0x1d);
    puVar9[0x1a] = uVar2;
    puVar9[0x1e] = *(undefined1 *)((int)puVar6 + 0x1e);
    puVar9[0x1b] = uVar1;
    puVar9[0x1c] = uVar3;
    puVar9[0x1d] = uVar4;
    puVar9[0x1f] = 0;
    FUN_00023f74(puVar6);
    uVar11 = dlsym(iVar8,puVar9);
    FUN_00023f68(puVar9,0x20);
  }
  local_30 = uVar11;
  local_2c = puVar5;
  __system_property_foreach(DAT_0002cab0 + 0x2ca84,&local_30);
  if (**(int **)(DAT_0002cab4 + 0x2ca94) != local_24) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(local_24);
  }
  return;
}


