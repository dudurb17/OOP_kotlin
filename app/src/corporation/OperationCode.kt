package corporation
enum class OperationCode(val title: String) {
  EXIT(title = "Exit"),
  REGISTER_NEW_ITEM(title = "Register new item"),
  DELETE_ITEM(title = "Delete item")
}
