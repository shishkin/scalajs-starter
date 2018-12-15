import org.scalajs.dom.document

object MainApp {

  def main(args: Array[String]): Unit = {
    println("Starting 'scalajs-example'...")

    val p = document.createElement("p")
    val text = document.createTextNode("Hello!")
    p.appendChild(text)
    document.body.appendChild(p)
  }
}
