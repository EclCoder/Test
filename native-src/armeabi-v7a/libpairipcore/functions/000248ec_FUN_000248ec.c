/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000248ec
 * Address  : 000248ec
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int FUN_000248ec(int param_1)

{
  int iVar1;
  undefined1 auStack_310 [392];
  undefined1 auStack_188 [336];
  undefined4 local_38 [3];
  code *local_2c;
  undefined4 local_24;
  undefined4 local_18;
  
  FUN_00025684(auStack_188);
  *(undefined4 *)(param_1 + 0xc) = 0;
  FUN_00024b54(auStack_310,auStack_188);
  do {
    do {
      iVar1 = FUN_00024ca8(auStack_310,local_38);
      if (iVar1 != 0) goto LAB_0002493c;
    } while (local_2c == (code *)0x0);
    *(undefined4 *)(param_1 + 0x48) = local_38[0];
    *(undefined4 *)(param_1 + 0x4c) = local_18;
    *(undefined4 *)(param_1 + 0x50) = local_24;
    iVar1 = (*local_2c)(0,param_1,auStack_310);
  } while (iVar1 == 8);
  if (iVar1 == 6) {
    FUN_00024954(auStack_188,auStack_310,param_1,0);
    iVar1 = 2;
  }
  else if (iVar1 != 9) {
LAB_0002493c:
    iVar1 = 3;
  }
  return iVar1;
}


