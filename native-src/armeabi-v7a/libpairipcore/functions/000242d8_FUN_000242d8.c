/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000242d8
 * Address  : 000242d8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined8 FUN_000242d8(undefined4 param_1,uint *param_2,uint param_3,uint param_4)

{
  byte bVar1;
  bool bVar2;
  undefined4 uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  int iVar7;
  uint uVar8;
  uint uVar9;
  uint *local_30;
  uint local_2c;
  uint local_28;
  
  bVar2 = false;
  local_2c = 0;
  local_30 = param_2;
  local_28 = param_4;
LAB_000242f0:
  if ((param_4 <= param_3) || (bVar2)) {
    if (local_2c == 0) {
      FUN_00024b9c(param_1,0xe,&local_28);
      FUN_00024bc8(param_1,0xf,local_28);
    }
    uVar3 = 8;
switchD_00024410_caseD_b5:
    return CONCAT44(local_30,uVar3);
  }
  uVar8 = param_3 + 1;
  bVar1 = *(byte *)((int)param_2 + (param_3 ^ 3));
  uVar9 = (uint)bVar1;
  if (-1 < (char)bVar1) {
    FUN_00024b9c(param_1,0xd,&local_28);
    if (uVar9 < 0x40) {
      local_28 = local_28 + uVar9 * 4 + 4;
    }
    else {
      local_28 = (local_28 - (uVar9 * 4 & 0xfc)) - 4;
    }
LAB_0002438a:
    FUN_00024bc8(param_1,0xd);
    bVar2 = false;
    param_3 = uVar8;
    goto LAB_000242f0;
  }
  uVar4 = uVar9 - 0x80 >> 4;
  if (5 < uVar4) goto LAB_0002450a;
  switch(uVar4) {
  case 0:
    if ((param_4 <= uVar8) ||
       (uVar8 = (uVar9 & 0xf) << 0xc | (uint)*(byte *)((int)param_2 + (uVar8 ^ 3)) << 4, uVar8 == 0)
       ) goto LAB_0002450a;
    bVar2 = false;
    FUN_00024648(param_1,0,uVar8,0);
    local_2c = local_2c | (uVar9 & 8) >> 3;
    param_3 = param_3 + 2;
    goto LAB_000242f0;
  case 1:
    if ((uVar9 & 0xf | 2) == 0xf) {
LAB_0002450a:
      return CONCAT44(local_30,9);
    }
    bVar2 = false;
    FUN_00024514(param_1,0,uVar9 & 0xf,0);
    FUN_00024bc8(param_1,0xd,local_28);
    param_3 = uVar8;
    local_30 = &local_28;
    goto LAB_000242f0;
  case 2:
    iVar7 = (uVar9 & 8) * 0x800 + ~(-1 << (uVar9 & 7) + 1) * 0x10;
    uVar3 = 0;
    break;
  case 3:
    bVar2 = true;
    uVar3 = 9;
    switch(uVar9) {
    case 0xb0:
      param_3 = uVar8;
      goto LAB_000242f0;
    case 0xb1:
      if (param_4 <= uVar8) goto switchD_00024410_caseD_b5;
      uVar8 = (uint)*(byte *)((int)param_2 + (uVar8 ^ 3));
      if (0xe < uVar8 - 1) goto LAB_0002450a;
      bVar2 = false;
      FUN_00024648(param_1,0,uVar8,0);
      param_3 = param_3 + 2;
      goto LAB_000242f0;
    case 0xb2:
      uVar4 = 0;
      uVar9 = 0;
      do {
        if (param_4 <= uVar8) goto LAB_0002450a;
        uVar5 = uVar8 ^ 3;
        uVar8 = uVar8 + 1;
        uVar6 = (uint)*(char *)((int)param_2 + uVar5);
        uVar5 = uVar9 & 0xff;
        uVar9 = uVar9 + 7;
        uVar4 = uVar4 | (uVar6 & 0x7f) << uVar5;
      } while ((int)uVar6 < 0);
      FUN_00024b9c(param_1,0xd,&local_28);
      local_28 = local_28 + uVar4 * 4 + 0x204;
      goto LAB_0002438a;
    case 0xb3:
      uVar3 = 1;
      uVar8 = (uint)*(byte *)((int)param_2 + (uVar8 ^ 3));
      uVar4 = uVar8 & 0xf | (uVar8 & 0xf0) << 0xc;
      goto LAB_000243cc;
    case 0xb4:
      uVar3 = 5;
      iVar7 = 0;
      break;
    case 0xb5:
    case 0xb6:
    case 0xb7:
      goto switchD_00024410_caseD_b5;
    default:
      uVar3 = 1;
      goto LAB_00024476;
    }
    break;
  case 4:
    if ((uVar9 & 0xfe) != 200) goto LAB_0002450a;
    bVar1 = *(byte *)((int)param_2 + (uVar8 ^ 3));
    uVar8 = (uint)(bVar1 >> 4);
    uVar4 = bVar1 & 0xf;
    if (uVar9 == 200) {
      uVar8 = uVar8 + 0x10;
    }
    if (0x1f < uVar8 + uVar4) goto LAB_0002450a;
    uVar4 = uVar4 | uVar8 << 0x10;
    uVar3 = 5;
LAB_000243cc:
    FUN_00024648(param_1,1,uVar4 + 1,uVar3);
    bVar2 = false;
    param_3 = param_3 + 2;
    goto LAB_000242f0;
  case 5:
    if ((int)(uVar9 << 0x1c) < 0) goto LAB_0002450a;
    uVar3 = 5;
LAB_00024476:
    FUN_00024648(param_1,1,(uVar9 & 7) + DAT_00024510,uVar3);
    bVar2 = false;
    param_3 = uVar8;
    goto LAB_000242f0;
  }
  bVar2 = false;
  FUN_00024648(param_1,uVar3,iVar7,0);
  param_3 = uVar8;
  goto LAB_000242f0;
}


