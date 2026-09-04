/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00028788
 * Address  : 00028788
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00028788(undefined8 *param_1,uint *param_2)

{
  uint uVar1;
  uint uVar2;
  uint *puVar3;
  uint uVar4;
  uint *puVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  bool bVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  
  uVar7 = *param_2;
  uVar8 = param_2[1];
  puVar5 = param_2 + 2;
  *(undefined1 *)((int)puVar5 + (uVar7 & 0x3f)) = 0x80;
  uVar1 = uVar7 + 1;
  uVar4 = uVar8 + (0xfffffffe < uVar7);
  *param_2 = uVar1;
  param_2[1] = uVar4;
  if ((uVar7 & 0x3f) == 0x3f) {
    FUN_000284f4(param_2);
    uVar1 = *param_2;
    uVar4 = param_2[1];
  }
  while ((uVar1 & 0x3f) != 0x38) {
    uVar2 = uVar1 & 0x3f;
    bVar11 = 0xfffffffe < uVar1;
    uVar1 = uVar1 + 1;
    uVar4 = uVar4 + bVar11;
    *(undefined1 *)((int)puVar5 + uVar2) = 0;
    *param_2 = uVar1;
    param_2[1] = uVar4;
    if (uVar2 == 0x3f) {
      FUN_000284f4(param_2);
      uVar1 = *param_2;
      uVar4 = param_2[1];
    }
  }
  uVar2 = uVar1 + 1;
  uVar4 = uVar4 + (0xfffffffe < uVar1);
  *(char *)((int)puVar5 + (uVar1 & 0x3f)) = (char)(uVar8 >> 0x15);
  *param_2 = uVar2;
  param_2[1] = uVar4;
  if ((uVar1 & 0x3f) == 0x3f) {
    FUN_000284f4(param_2);
    uVar2 = *param_2;
    uVar4 = param_2[1];
  }
  uVar1 = uVar2 + 1;
  uVar4 = uVar4 + (0xfffffffe < uVar2);
  *(char *)((int)puVar5 + (uVar2 & 0x3f)) = (char)(uVar8 >> 0xd);
  *param_2 = uVar1;
  param_2[1] = uVar4;
  if ((uVar2 & 0x3f) == 0x3f) {
    FUN_000284f4(param_2);
    uVar1 = *param_2;
    uVar4 = param_2[1];
  }
  uVar2 = uVar1 + 1;
  uVar4 = uVar4 + (0xfffffffe < uVar1);
  *(char *)((int)puVar5 + (uVar1 & 0x3f)) = (char)(uVar8 >> 5);
  *param_2 = uVar2;
  param_2[1] = uVar4;
  if ((uVar1 & 0x3f) == 0x3f) {
    FUN_000284f4(param_2);
    uVar2 = *param_2;
    uVar4 = param_2[1];
  }
  uVar1 = uVar2 + 1;
  uVar4 = uVar4 + (0xfffffffe < uVar2);
  *(byte *)((int)puVar5 + (uVar2 & 0x3f)) = (byte)(uVar7 >> 0x1d) | (byte)(uVar8 << 3);
  *param_2 = uVar1;
  param_2[1] = uVar4;
  if ((uVar2 & 0x3f) == 0x3f) {
    FUN_000284f4(param_2);
    uVar1 = *param_2;
    uVar4 = param_2[1];
  }
  uVar8 = uVar1 + 1;
  uVar4 = uVar4 + (0xfffffffe < uVar1);
  *(char *)((int)puVar5 + (uVar1 & 0x3f)) = (char)(uVar7 >> 0x15);
  *param_2 = uVar8;
  param_2[1] = uVar4;
  if ((uVar1 & 0x3f) == 0x3f) {
    FUN_000284f4(param_2);
    uVar8 = *param_2;
    uVar4 = param_2[1];
  }
  uVar1 = uVar8 + 1;
  uVar4 = uVar4 + (0xfffffffe < uVar8);
  *(char *)((int)puVar5 + (uVar8 & 0x3f)) = (char)(uVar7 >> 0xd);
  *param_2 = uVar1;
  param_2[1] = uVar4;
  if ((uVar8 & 0x3f) == 0x3f) {
    FUN_000284f4(param_2);
    uVar1 = *param_2;
    uVar4 = param_2[1];
  }
  uVar8 = uVar1 + 1;
  uVar4 = uVar4 + (0xfffffffe < uVar1);
  *(char *)((int)puVar5 + (uVar1 & 0x3f)) = (char)(uVar7 >> 5);
  *param_2 = uVar8;
  param_2[1] = uVar4;
  if ((uVar1 & 0x3f) == 0x3f) {
    FUN_000284f4(param_2);
    uVar8 = *param_2;
    uVar4 = param_2[1];
  }
  uVar1 = uVar8 & 0x3f;
  *param_2 = uVar8 + 1;
  param_2[1] = uVar4 + (0xfffffffe < uVar8);
  puVar3 = (uint *)(uVar8 + 1);
  if (uVar1 == 0x3f) {
    puVar3 = param_2;
  }
  *(char *)((int)puVar5 + uVar1) = (char)(uVar7 << 3);
  if (uVar1 == 0x3f) {
    FUN_000284f4(puVar3);
  }
  uVar1 = param_2[0x12];
  uVar4 = param_2[0x13];
  uVar7 = param_2[0x14];
  uVar8 = param_2[0x15];
  uVar6 = param_2[0x16];
  uVar2 = param_2[0x17];
  uVar9 = param_2[0x18];
  uVar10 = param_2[0x19];
  param_2[2] = uVar1 << 0x18 | (uVar1 >> 8 & 0xff) << 0x10 | (uVar1 >> 0x10 & 0xff) << 8 |
               uVar1 >> 0x18;
  param_2[3] = uVar4 << 0x18 | (uVar4 >> 8 & 0xff) << 0x10 | (uVar4 >> 0x10 & 0xff) << 8 |
               uVar4 >> 0x18;
  param_2[4] = uVar7 << 0x18 | (uVar7 >> 8 & 0xff) << 0x10 | (uVar7 >> 0x10 & 0xff) << 8 |
               uVar7 >> 0x18;
  param_2[5] = uVar8 << 0x18 | (uVar8 >> 8 & 0xff) << 0x10 | (uVar8 >> 0x10 & 0xff) << 8 |
               uVar8 >> 0x18;
  param_2[6] = uVar6 << 0x18 | (uVar6 >> 8 & 0xff) << 0x10 | (uVar6 >> 0x10 & 0xff) << 8 |
               uVar6 >> 0x18;
  uVar12 = *(undefined8 *)(param_2 + 4);
  param_2[7] = uVar2 << 0x18 | (uVar2 >> 8 & 0xff) << 0x10 | (uVar2 >> 0x10 & 0xff) << 8 |
               uVar2 >> 0x18;
  param_2[8] = uVar9 << 0x18 | (uVar9 >> 8 & 0xff) << 0x10 | (uVar9 >> 0x10 & 0xff) << 8 |
               uVar9 >> 0x18;
  param_2[9] = uVar10 << 0x18 | (uVar10 >> 8 & 0xff) << 0x10 | (uVar10 >> 0x10 & 0xff) << 8 |
               uVar10 >> 0x18;
  uVar13 = *(undefined8 *)(param_2 + 6);
  uVar14 = *(undefined8 *)(param_2 + 8);
  *param_1 = *(undefined8 *)puVar5;
  param_1[1] = uVar12;
  param_1[2] = uVar13;
  param_1[3] = uVar14;
  return;
}


