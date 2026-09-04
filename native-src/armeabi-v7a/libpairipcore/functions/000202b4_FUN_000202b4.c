/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000202b4
 * Address  : 000202b4
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_000202b4(int param_1,int param_2)

{
  ushort uVar1;
  bool bVar2;
  undefined4 uVar3;
  int iVar4;
  
  if ((*(int *)(param_2 + 0x14) == 0) &&
     ((iVar4 = FUN_0001d2ce(*(undefined4 *)(param_1 + 0xc),*(undefined4 *)(param_1 + 0x10),
                            DAT_00020388 + 0x202d6,1), iVar4 != 0 ||
      (iVar4 = FUN_0001d2ce(*(undefined4 *)(param_1 + 0xc),*(undefined4 *)(param_1 + 0x10),
                            DAT_0002038c + 0x202e6,2), iVar4 != 0)))) {
    FUN_000203aa(param_2,0x28);
    bVar2 = true;
  }
  else {
    bVar2 = false;
  }
  uVar1 = *(ushort *)(param_1 + 5) << 10;
  iVar4 = (int)((uint)*(ushort *)(param_1 + 5) << 0x1a) >> 0x1a;
  if (uVar1 == 0x4400) {
    iVar4 = 0xf;
  }
  FUN_000203bc(*(undefined4 *)(param_1 + 8),param_2,iVar4,uVar1 != 0x4400);
  iVar4 = FUN_0001d2ce(*(undefined4 *)(param_1 + 0xc),*(undefined4 *)(param_1 + 0x10),
                       DAT_00020390 + 0x20328,1);
  if (iVar4 == 0) {
    FUN_0001dcd6(param_2,DAT_00020394 + 0x20336,1);
  }
  uVar3 = FUN_0001dcd6(param_2,*(undefined4 *)(param_1 + 0xc),*(undefined4 *)(param_1 + 0x10));
  FUN_0001dcd6(uVar3,DAT_00020398 + 0x2034a,1);
  FUN_000203bc(*(undefined4 *)(param_1 + 0x14),param_2,
               (int)((uint)*(ushort *)(param_1 + 5) << 0x1a) >> 0x1a,DAT_00020384 + (uint)uVar1 == 0
              );
  if (bVar2) {
    FUN_000203fa(param_2,0x29);
    return;
  }
  return;
}


