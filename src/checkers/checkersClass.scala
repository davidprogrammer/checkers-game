package checkers

import javafx.application.Application
import javafx.stage.Stage
import javafx.scene.Scene
import javafx.scene.layout.StackPane
import javafx.scene.shape.Rectangle
import javafx.scene.paint.Color
import javafx.scene.layout.VBox
import javafx.scene.control.TextField
import javafx.scene.control.Button
import javafx.event.EventHandler
import javafx.event.ActionEvent

class ScalaJavaFXApp extends Application {
  println("ScalaJavaFXApp constructor")
  def start(stage : Stage) : Unit = {
    println("start " + stage)
    class line1{
      
    }
    class line2{
      
    }
    class line3{
      
    }
    class line4{
      
    }
    
    class space(var number : Int, var lineNumber : Int) {
      var numberOfLine = lineNumber
      var spaceNumber = number
      var isTaken = false
      var isTakenByWhite = false
      var isTakenByBlack = false
       
    }
    
     val spaceOne = new space(1,1)
    val spaceTwo = new space(2,1)
    val spaceThree = new space(3,1)
    val spaceFour = new space(4,1)
    val spaceFive = new space(5,1)
    val spaceSix = new space(6,1)
    val spaceSeven = new space(7,1)
    val spaceEight= new space(8,1)
    val spaceNine = new space(9,2)
    val spaceTen = new space(10,2)
    val spaceEleven = new space(11,2)
    val spaceTwelve = new space(12,2)
    val spaceThirteen = new space(13,2)
    val spaceFourteen = new space(14,2)
    val spaceFifteen = new space(15,2)
    val spaceSixteen = new space(16,3)
    val spaceSeventeen = new space(17,3)
    val spaceEighteen = new space(18,3)
    val spaceNineteen = new space(19,3)
    val spaceTwenty = new space(20,3)
    val spaceTwentyOne = new space(21,3)
    val spaceTwentyTwo = new space(22,3)
    val spaceTwentyThree = new space(23,3)
    val spaceTwentyFour = new space(24,4)
    val spaceTwentyFive = new space(25,4)
    val spaceTwentySix = new space(26,4)
    val spaceTwentySeven = new space(27,4)
    val spaceTwentyEight = new space(28,4)
    val spaceTwentyNine = new space(29,4)
    val spaceThirty = new space(30,4)
    val spaceThirtyOne = new space(31,4)
    val spaceThirtyTwo = new space(32,5)
    val spaceThirtyThree = new space(33,5)
    val spaceThirtyFour = new space(34,5)
    val spaceThirtyFive = new space(35,5)
    val spaceThirtySix = new space(36,5)
    val spaceThirtySeven= new space(37,5)
    val spaceThirtyEight = new space(38,5)
    val spaceThirtyNine = new space(39,5)
    val spaceForty = new space(40,6)
    
    
    val spacesVector = Vector(spaceOne,spaceTwo, spaceThree)
    
    
    var textField1 = new TextField();
    var textField2 = new TextField();
    
    val numOne =(textField1.getText().toInt);
    val numTwo =(textField2.getText().toInt);
    val buttonGo = new Button
    
    buttonGo.setOnAction(new EventHandler[ActionEvent]() {
      override def handle(event: ActionEvent): Unit = {
        if(spacesVector(numOne).isTakenByBlack && spacesVector(numTwo).isTaken == false && (numOne + numTwo = 7 || numOne + numTwo = 9) &&
            spacesVector(numOne).numberOfLine + 1 = spacesVector(numTwo).numberOfLine){
          spacesVector(numOne).isTaken == false
          spacesVector(numTwo).isTakenByBlack == true
          
        }

      }
    })
    
    val rectOne = new Rectangle(0, 0, 50, 50)
    rectOne.setFill(Color.BLACK)
    val vbox = new VBox(8);
    vbox.getChildren().addAll(rectOne)
    
     val root = new StackPane();
    root.getChildren().add(vbox);
    stage.setScene(new Scene(root, 800, 800));
    stage.show();
  }
}


object ScalaJavaFXApp {
  def main(args : Array[String]) : Unit = {
    println("Launching ScalaJavaFXApp")
    Application.launch(classOf[ScalaJavaFXApp], args : _*)
  }
}