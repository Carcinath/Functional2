import java.net._
import java.io._
import scala.io._

object EchoServer {
        def main(args: Array[String]) {
          val server = new ServerSocket(9999)
          val filepath = System.getProperty("user.dir")
          try {
            val page = Source.fromFile(path + "//src//main//scala//home.html")
            while (true) {
              val s = server.accept()
              val in = new BufferedSource(s.getInputStream()).getLines()
              val out = new PrintStream(s.getOutputStream())

              out.println(in.next())
              out.flush()
              s.close()
            }
          }
          catch {
            case ex: FileNotFoundException => {
              val page = Source.fromFile(path + "//src//main//scala//404.html")
            }
              while (true) {
                val s = server.accept()
                val in = new BufferedSource(s.getInputStream()).getLines()
                val out = new PrintStream(s.getOutputStream())

                out.println(in.next())
                out.flush()
                s.close()
              }
          }
        }
}
